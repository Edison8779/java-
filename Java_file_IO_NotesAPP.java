import java.io.*;
import java.util.*;
public class Java_file_IO_NotesAPP {
        static final String FILE_NAME = "notes.txt";

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n--- Notes App ---");
                System.out.println("1. Add Note");
                System.out.println("2. View Notes");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();  // consume newline

                switch (choice) {
                    case 1:
                        addNote(scanner);
                        break;
                    case 2:
                        viewNotes();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } while (choice != 3);

            scanner.close();
        }

        // Writing to file using FileWriter
        private static void addNote(Scanner scanner) {
            try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
                System.out.print("Enter your note: ");
                String note = scanner.nextLine();
                fw.write(note + "\n");
                System.out.println("Note saved! ");
            } catch (IOException e) {
                System.out.println("Error writing to file");
                e.printStackTrace();
            }
        }

        // Reading from file using BufferedReader
        private static void viewNotes() {
            try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
                System.out.println("\n--- Your Notes ---");
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println("- " + line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("No notes found. Try adding one!");
            } catch (IOException e) {
                System.out.println("Error reading file ");
                e.printStackTrace();
            }
        }

}
