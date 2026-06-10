/*
Token Management System

A hospital issues tokens to patients.

Requirements:
Add 5 patient names into a Queue.
Display all patients waiting in the queue.
Serve the first patient.
Display the patient being served.
Display the remaining queue.
Concepts Tested:
Queue
offer()
poll()
peek()

Instructions - 
Create a Queue called patientQueue

Add the following patients into the queue:
    Arun
    Priya
    Ravi
    Meena
    Karthik

Display all patients waiting in the queue

Serve the first patient
Store the served patient in servedPatient

Display the served patient

Display the remaining patients in the queue
*/
package java_internship_day14;
import java.util.Scanner;
import java.util.*;
public class Queue_Token_Management_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<String> patientQueue = new LinkedList<>();
		int num,i;
		String name,firstServed;
		System.out.println("Enter the number of pateint :");
		num = sc.nextInt();
		sc.nextLine();
		for(i=0;i<num;i++) {
			System.out.println("Enter the name :");
			name = sc.nextLine();
			patientQueue.offer(name);
		}
		System.out.println("The names are : \n"+patientQueue);
		firstServed = patientQueue.poll();
		System.out.println("Now served : "+firstServed);
		System.out.println("Remaining are : \n" +patientQueue);
		sc.close();
	}

}
