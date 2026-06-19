/*
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

        System.out.println("Registered Participants: " + participants);
        System.out.println("Total Unique Participants: " + participants.size());
    }
}
