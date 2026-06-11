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
import java.util.*;

public class Token_Management_System {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generating queue named patientQueue
		
		Queue<String> patientQueue = new LinkedList<>();
		//Adding patients in queue using offer()
		
		
		patientQueue.offer("Ayush");
		patientQueue.offer("Asmit");
		patientQueue.offer("Sanjeeb");
		patientQueue.offer("Supriya");
		patientQueue.offer("Nandini");
		
		System.out.println("Patients in the queue order: ");
		int i=1;
		for(String name:patientQueue)
		{
			System.out.println(i+"."+name);
			i++;
		}
		
		//Peeking the first patient and then adding it to servedPatient
		System.out.println("Serving the first patient: "+patientQueue.peek());
		String servedPatient = patientQueue.poll();
		System.out.println("Served patients: "+servedPatient);
		
		//Remaining patients in the patientQueue
		System.out.println("Remaining patients in queue:");
		i=1;
		for(String name:patientQueue)
		{
			System.out.println(i+"."+name);
			i++;
		}
		
	}

}
