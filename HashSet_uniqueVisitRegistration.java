import java.util.HashSet;

public class HashSet_uniqueVisitRegistration {
    public static void main(String[] args) {

        HashSet<String> participants = new HashSet<>();

        // Adding participant names
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
        for (String name : participants) {
            System.out.println(name);
        }

        // Display total number of unique participants
        System.out.println("\nTotal Unique Participants: " + participants.size());
    }
}
