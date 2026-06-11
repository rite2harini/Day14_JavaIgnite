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
    package JavaIgniteDay14;
import java.util.HashSet;

public class Unique_Visitor_Registration {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generating hashset named participants
		
		HashSet<String> participants = new HashSet<>();
		//adding participants in it
		
		
		participants.add("Asmit");
		participants.add("Ayush");
		participants.add("Sanjeeb");
		participants.add("Supriya");
		participants.add("Nandini");
		participants.add("Simuna");
		participants.add("Satya");
		participants.add("Surya");
		participants.add("Abhijit");
		participants.add("Arya");
		participants.add("Sumeet");
		participants.add("Samarjit");
		participants.add("Ratikant");
		
		//Displaying all the registered participants
		System.out.println("Registered participants: "+ participants);
		
		//Displaying total no. of participants registered
		System.out.println("Total no. of registered participants: "+participants.size());
		
		}

}



Display all registered participants

Display the total number of participants

*/
