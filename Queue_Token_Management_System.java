import java.util.LinkedList;
import java.util.Queue;

public class Queue_Token_Management_System {
    public static void main(String[] args) {

        Queue<String> patientQueue = new LinkedList<>();

        // Add patients to the queue
        patientQueue.offer("Arun");
        patientQueue.offer("Priya");
        patientQueue.offer("Ravi");
        patientQueue.offer("Meena");
        patientQueue.offer("Karthik");

        // Display all patients waiting
        System.out.println("Patients Waiting: " + patientQueue);

        // Display first patient using peek()
        System.out.println("Next Patient: " + patientQueue.peek());

        // Serve the first patient
        String servedPatient = patientQueue.poll();

        // Display served patient
        System.out.println("Served Patient: " + servedPatient);

        // Display remaining queue
        System.out.println("Remaining Patients: " + patientQueue);
    }
}
