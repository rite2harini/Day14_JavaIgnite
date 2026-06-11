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

public class TokenManagement {
    public static void main(String[] args) {
        Queue<String> patientQueue = new LinkedList<>();
        
        // Adding patients
        String[] patients = {"Arun", "Priya", "Ravi", "Meena", "Karthik"};
        for (String patient : patients) {
            patientQueue.offer(patient);
        }
        
        // Display waiting queue
        System.out.println("Patients waiting: " + patientQueue);
        
        // Serve first patient
        String servedPatient = patientQueue.poll();
        
        // Display results
        System.out.println("Serving: " + servedPatient);
        System.out.println("Remaining patients: " + patientQueue);
    }
}
