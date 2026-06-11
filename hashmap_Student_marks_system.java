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
import java.util.Map;
import java.util.Scanner;

public class StudentMarksLookupSystem {
    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Add student records
        students.put(101, "John");
        students.put(102, "Priya");
        students.put(103, "Rahul");
        students.put(104, "David");
        students.put(105, "Anu");

        // Display all student records
        System.out.println("Student Records:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Ask user to enter Student ID
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Student ID: ");
        int id = sc.nextInt();

        // Check and display result
        if (students.containsKey(id)) {
            System.out.println("Student Name: " + students.get(id));
        } else {
            System.out.println("Student Not Found");
        }

        sc.close();
    }
}
