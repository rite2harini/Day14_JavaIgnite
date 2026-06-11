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
import java.util.Scanner;

public class UniqueVisitorRegistration {
    public static void main(String[] args) {

        HashSet<String> participants = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of participants: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter participant name " + i + ": ");
            String name = sc.nextLine();
            participants.add(name);
        }

        System.out.println("\nRegistered Participants:");
        for (String participant : participants) {
            System.out.println(participant);
        }

        System.out.println("\nTotal Unique Participants: " + participants.size());

        sc.close();
    }
}
