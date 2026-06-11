/*
Student Marks Lookup System

Create a program that stores the following details using a HashMap:

Student ID → Student Name
Requirements:
Add at least 5 students.
Display all student records.
Ask the user to enter a Student ID.
Display the corresponding Student Name.

If the ID does not exist, print:

Student Not Found
Hint - use HashMap
put()
get()
containsKey()

Instructions - 
Create a HashMap called students

Add student records:
    101 → John
    102 → Priya
    103 → Rahul
    104 → David
    105 → Anu

Display all student records

Ask the user to enter a Student ID

Read the Student ID

IF the Student ID exists in the HashMap THEN
       Get the student name using the ID
       Display the student name
ELSE  Display "Student Not Found"
END IF
  */
import java.util.HashMap;
import java.util.Scanner;

public class StudentLookup {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        // Adding student records
        students.put(101, "John");
        students.put(102, "Priya");
        students.put(103, "Rahul");
        students.put(104, "David");
        students.put(105, "Anu");
        
        // Display all records
        System.out.println("Student Records:");
        for (Integer id : students.keySet()) {
            System.out.println("ID: " + id + " → Name: " + students.get(id));
        }
        
        // Search by ID
        System.out.print("\nEnter Student ID to search: ");
        int searchID = scanner.nextInt();
        
        if (students.containsKey(searchID)) {
            System.out.println("Student Found: " + students.get(searchID));
        } else {
            System.out.println("Student Not Found");
        }
        
        scanner.close();
    }
}
