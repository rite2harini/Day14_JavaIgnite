public class TokenManagementSystem {
	    public static void main(String[] args) {

	        // Create Queue
	        Queue<String> patientQueue = new LinkedList<>();

	        // Add patients into the queue
	        patientQueue.offer("Arun");
	        patientQueue.offer("Priya");
	        patientQueue.offer("Ravi");
	        patientQueue.offer("Meena");
	        patientQueue.offer("Karthik");

	        // Display all patients waiting in the queue
	        System.out.println("Patients waiting in the queue:");
	        System.out.println(patientQueue);

	        // Serve the first patient
	        String servedPatient = patientQueue.poll();

	        // Display the served patient
	        System.out.println("\nPatient being served: " + servedPatient);

	        // Display the remaining patients in the queue
	        System.out.println("\nRemaining patients in the queue:");
	        System.out.println(patientQueue);
	    }
	}

