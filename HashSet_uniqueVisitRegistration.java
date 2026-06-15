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
package java_internship_day14;
import java.util.HashSet;
import java.util.Scanner;
public class HashSet_uniqueVisitRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashSet<String> participants = new HashSet<>();
		int num,i;
		String name;
		System.out.println("Enter the number of participants :");
		num = sc.nextInt();
		sc.nextLine();
		for(i=0;i<num;i++) {
			System.out.println("Enter the name of the students :");
			name = sc.nextLine();
			participants.add(name);
		}
		System.out.println("There are total " + participants.size() + " number of student ");
		System.out.println("Nameas are :");
		for(String name1 : participants) {
			System.out.println(name1);
		}
		sc.close();
	} 
}
