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


public class Student_Marks
{

	public static void main(String[] args)
    {
		// TODO Auto-generated method stub
		 // Create HashMap
        HashMap<Integer, String> students = new HashMap<>();

        students.put(102, "Ayush");
        students.put(103, "Asmit");
        students.put(104, "Sanjeeb");
        students.put(105, "Arya");
        students.put(101, "Nandini");

        // Display all student records
        System.out.println("Student Records:");
        for (Integer id : students.keySet()) {
            System.out.println("ID: " + id + "  Name: " + students.get(id));
        }

        // Take input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Student ID: ");
        int studentId = sc.nextInt();

        // Check if ID exists
        if (students.containsKey(studentId)) {

            String studentName = students.get(studentId);

            System.out.println("Student Name: " + studentName);

        } else {

            System.out.println("Student Not Found");

        }

        sc.close();
    }
}
