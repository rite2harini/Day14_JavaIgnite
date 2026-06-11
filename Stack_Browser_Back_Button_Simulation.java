want the pseudo code for 
/*
A browser stores visited pages in a Stack.

Requirements:
Push 5 website names into a Stack.
Display all visited websites.
Simulate pressing the Back button twice.
Display the pages that were removed.
Display the current page after going back.
Concepts Tested:
Stack
push()
pop()
peek()

Instructions-
Create a Stack called browserHistory

Push the following websites into the Stack:
    google.com
    youtube.com
    github.com
    wikipedia.org
    stackoverflow.com

Display all visited websites

Print "Pressing Back Button..."

Remove the top website from the Stack
Store it in removedPage1

Remove the next top website from the Stack
Store it in removedPage2

Display removedPage1

Display removedPage2

Get the current page using peek()
Store it in currentPage

Display currentPage

*/
import java.util.*;

public class Stack_Browser {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generating the stack named browserHistory
		Stack<String> browserHistory = new Stack<>();
		
		//Pushing the names of websites visited
		browserHistory.push("google.com");
		browserHistory.push("youtube.com");
		browserHistory.push("github.com");
		browserHistory.push("wikipedia.org");
		browserHistory.push("stackoverflow.com");
		
		//Displaying visited websites
		System.out.println("Visited websites:");
		for(String websites:browserHistory)
		{
			System.out.println(websites);
		}
		//Removing websites
		System.out.println("\nPressing Back Button...\n");
		
		String removedPage1 = browserHistory.pop();
		String removedPage2 = browserHistory.pop();
		
		System.out.println("Removed pages:\n"+removedPage1+"\n"+removedPage2);
		
		//Getting the current page
		String currentPage = browserHistory.peek();
		System.out.println("\nCurrent page:\n"+currentPage);
		
	}

}


