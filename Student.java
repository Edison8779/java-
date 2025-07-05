import java.util.*;

public class Student {
    int id;
    String name;
    int age;
    String department;
    String gender;
    int marks;

    Student(int id, String name, int age, String department, String gender, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.gender = gender;
        this.marks = marks;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age +
                ", Dept: " + department + ", Gender: " + gender +
                ", Marks: " + marks;
    }
}