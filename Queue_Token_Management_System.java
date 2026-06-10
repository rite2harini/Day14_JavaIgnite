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
package day14_progs;
import java.util.*;

public class Queue_Token_Management_System {

    public static void main(String[] args) {

        Queue<String> patientQueue = new LinkedList<>();

        patientQueue.offer("Arun");
        patientQueue.offer("Priya");
        patientQueue.offer("Ravi");
        patientQueue.offer("Meena");
        patientQueue.offer("Karthik");

        System.out.println("Patients waiting in queue:");
        System.out.println(patientQueue);

        String servedPatient = patientQueue.poll();

        System.out.println("Patient being served: " + servedPatient);

        System.out.println("Remaining queue:");
        System.out.println(patientQueue);
    }
}
