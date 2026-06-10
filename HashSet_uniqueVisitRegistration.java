import java.util.HashSet;
public class UniqueVisitorRegistration {
	    public static void main(String[] args) {

	        HashSet<String> participants = new HashSet<>();

	       
	        participants.add("Arun");
	        participants.add("Priya");
	        participants.add("Ravi");
	        participants.add("Meena");
	        participants.add("Karthik");
	        participants.add("Priya");  
	        participants.add("Ravi");   
	        participants.add("Divya");
	        participants.add("Arun");   

	        System.out.println("Registered Participants:");
	        for (String participant : participants) {
	            System.out.println(participant);
	        }

	       
	        System.out.println("\nTotal Unique Participants: " + participants.size());
	    }
	}
