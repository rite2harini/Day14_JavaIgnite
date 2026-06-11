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
  */import java.util.HashMap;
import java.util.Scanner;

public class StudentMarksLookupSystem {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "John");
        students.put(102, "Priya");
        students.put(103, "Rahul");
        students.put(104, "David");
        students.put(105, "Anu");

        System.out.println("Student Records:");
        for (Integer id : students.keySet()) {
            System.out.println(id + " -> " + students.get(id));
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();

        if (students.containsKey(studentId)) {
            String studentName = students.get(studentId);
            System.out.println("Student Name: " + studentName);
        } else {
            System.out.println("Student Not Found");
        }
    }
}
