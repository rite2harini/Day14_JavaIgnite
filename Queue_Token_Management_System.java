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

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Token_Management_System {
    public static void main(String[] args) {

        // Create Queue
        Queue<String> patientQueue = new LinkedList<>();

        // Add patients to the queue
        patientQueue.offer("Arun");
        patientQueue.offer("Priya");
        patientQueue.offer("Ravi");
        patientQueue.offer("Meena");
        patientQueue.offer("Karthik");

        // Display all patients waiting
        System.out.println("Patients Waiting in Queue:");
        System.out.println(patientQueue);

        // Serve the first patient
        String servedPatient = patientQueue.poll();

        // Display served patient
        System.out.println("\nServed Patient: " + servedPatient);

        // Display remaining queue
        System.out.println("\nRemaining Patients in Queue:");
        System.out.println(patientQueue);
    }
}
