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
package java_internship_day14;
import java.util.Scanner;
import java.util.*;
public class Hashmap_Student_marks_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,String> students = new HashMap<>();
		int num,i,id,searchid;
		String name;
		System.out.println("Enter the number of students :");
		num = sc.nextInt();
		sc.nextLine();
		for(i=0;i<num;i++) {
			System.out.println("Enter the name of the student:");
			name = sc.nextLine();
			System.out.println("Enter the id of the student :");
			id = sc.nextInt();
			sc.nextLine();
			students.put(id, name);
		}
		System.out.println("The details are :");
		System.out.println(students);
		System.out.println("Enter the id for searching of students: ");
		searchid = sc.nextInt();
		if(students.containsKey(searchid)) {
			System.out.println("Student found :");
			System.out.println(students.get(searchid));
		}
		else {
			System.out.println("No student found...invalid id");
		}
		sc.close();
	}

}
