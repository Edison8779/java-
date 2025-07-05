import java.sql.*;
import java.util.Scanner;

public class EmployeeApp {
    static final String DB_URL = "jdbc:mysql://localhost:3306/company";
    static final String USER = "root"; // Change if needed
    static final String PASS = "password"; // Change if needed

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            while (true) {
                System.out.println("\n1. Add 2. View 3. Update 4. Delete 5. Exit");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1 -> addEmployee(conn, sc);
                    case 2 -> viewEmployees(conn);
                    case 3 -> updateEmployee(conn, sc);
                    case 4 -> deleteEmployee(conn, sc);
                    case 5 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid choice!");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void addEmployee(Connection conn, Scanner sc) throws SQLException {
        System.out.print("ID: ");
        int id = sc.nextInt();
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Department: ");
        String dept = sc.next();
        System.out.print("Salary: ");
        double sal = sc.nextDouble();

        String sql = "INSERT INTO employee (id, name, age, department, salary) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, age);
        ps.setString(4, dept);
        ps.setDouble(5, sal);
        ps.executeUpdate();
        System.out.println("Employee added successfully.");
    }

    static void viewEmployees(Connection conn) throws SQLException {
        String sql = "SELECT * FROM employee";
        ResultSet rs = conn.createStatement().executeQuery(sql);
        System.out.println("\nID\tName\tAge\tDept\tSalary");
        while (rs.next()) {
            System.out.printf("%d\t%s\t%d\t%s\t%.2f\n",
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("department"),
                    rs.getDouble("salary"));
        }
    }

    static void updateEmployee(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        System.out.print("New Salary: ");
        double sal = sc.nextDouble();
        String sql = "UPDATE employee SET salary = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setDouble(1, sal);
        ps.setInt(2, id);
        int rows = ps.executeUpdate();
        if (rows > 0)
            System.out.println("Updated successfully.");
        else
            System.out.println("Employee not found.");
    }

    static void deleteEmployee(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        String sql = "DELETE FROM employee WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        int rows = ps.executeUpdate();
        if (rows > 0)
            System.out.println("Deleted successfully.");
        else
            System.out.println("Employee not found.");
    }
}
