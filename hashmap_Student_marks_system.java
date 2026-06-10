import java.util.HashMap;
import java.util.Scanner;

public class hashmap_Student_marks_system {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        // Add student records
        students.put(101, "John");
        students.put(102, "Priya");
        students.put(103, "Rahul");
        students.put(104, "David");
        students.put(105, "Anu");

        // Display all student records
        System.out.println("Student Records:");
        System.out.println(students);

        // Ask user for Student ID
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        // Check and display student name
        if (students.containsKey(id)) {
            System.out.println("Student Name: " + students.get(id));
        } else {
            System.out.println("Student Not Found");
        }

        sc.close();
    }
}
