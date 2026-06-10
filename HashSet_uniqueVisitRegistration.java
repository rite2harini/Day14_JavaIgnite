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
public class Unique_visit_registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generating hashset named participants
		HashSet<String> participants = new HashSet<>();
		//adding participants in it
		participants.add("Arun");
		participants.add("Priya");
		participants.add("Ravi");
		participants.add("Meena");
		participants.add("Karthik");
		participants.add("Priya");
		participants.add("Ravi");
		participants.add("Divya");
		participants.add("Arun");
		participants.add("Tanmay");
		participants.add("Rahul");
		participants.add("Sohail");
		participants.add("Tanmay");
		
		//Displaying all the registered participants
		System.out.println("Registered participants: "+ participants);
		
		//Displaying total no. of participants registered
		System.out.println("Total no. of registered participants: "+participants.size());
		
		}

}
