import java.util.LinkedList;
import java.util.Queue;
public class TokenManagementSystem {
	    public static void main(String[] args) {

	     
	        Queue<String> patientQueue = new LinkedList<>();

	       
	        patientQueue.offer("Arun");
	        patientQueue.offer("Priya");
	        patientQueue.offer("Ravi");
	        patientQueue.offer("Meena");
	        patientQueue.offer("Karthik");

	      
	        System.out.println("Patients waiting in the queue:");
	        System.out.println(patientQueue);

	     
	        String servedPatient = patientQueue.poll();

	       
	        System.out.println("\nPatient being served: " + servedPatient);

	      
	        System.out.println("\nRemaining patients in the queue:");
	        System.out.println(patientQueue);
	    }
	}
