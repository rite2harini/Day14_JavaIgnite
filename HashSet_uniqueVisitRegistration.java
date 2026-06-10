public class UniqueVisitorRegistration {
	    public static void main(String[] args) {

	        // Create HashSet
	        HashSet<String> participants = new HashSet<>();

	        // Add participant names
	        participants.add("Arun");
	        participants.add("Priya");
	        participants.add("Ravi");
	        participants.add("Meena");
	        participants.add("Karthik");
	        participants.add("Priya");   // Duplicate
	        participants.add("Ravi");    // Duplicate
	        participants.add("Divya");
	        participants.add("Arun");    // Duplicate

	        // Display all registered participants
	        System.out.println("Registered Participants:");
	        for (String participant : participants) {
	            System.out.println(participant);
	        }

	        // Display total number of unique participants
	        System.out.println("\nTotal Unique Participants: " + participants.size());
	    }
	}

	
