import java.util.HashSet;

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
}/*
Unique Visitor Registration

A college event registration system should not allow duplicate registrations.

Requirements:
Store participant names using a HashSet.
Add at least 8 names.
Intentionally add a few duplicate names.
Display all registered participants.
Display the total number of unique participants.
Hints
HashSet
add()
size()
Duplicate removal behavior

Instructions - 
Create a HashSet called participants

Add participant names:
    Arun
    Priya
    Ravi
    Meena
    Karthik
    Priya      (Duplicate)
    Ravi       (Duplicate)
    Divya
    Arun       (Duplicate)

Display all registered participants

Display the total number of participants

*/
