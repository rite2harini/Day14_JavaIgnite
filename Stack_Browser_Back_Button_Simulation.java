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
/*
 * START

Create a Stack called browserHistory

Push "google.com" into browserHistory
Push "youtube.com" into browserHistory
Push "github.com" into browserHistory
Push "wikipedia.org" into browserHistory
Push "stackoverflow.com" into browserHistory

Display "Visited Websites:"
Display browserHistory

Display "Pressing Back Button..."

Remove top website using pop()
Store it in removedPage1

Remove next top website using pop()
Store it in removedPage2

Display "Removed Page 1: " + removedPage1
Display "Removed Page 2: " + removedPage2

Get current page using peek()
Store it in currentPage

Display "Current Page: " + currentPage

STOP
 */
package day14_progs;
import java.util.*;
public class Stack_Browser_Back_Button_Simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <String> browserHistory =new Stack<>();
	
		browserHistory.push("google.com");
		browserHistory.push("youtube.com");
		browserHistory.push("github.com");
		browserHistory.push("wikipedia.org");
		browserHistory.push("stackoverflow.com");
		
		System.out.print("Visired Websites are ↓\n");
		System.out.println(browserHistory);
		
		System.out.println("Pressing Back Button...");
		String  removedPage1 =browserHistory.pop();
		System.out.println(removedPage1 + " removed");
		
		System.out.println("Pressing Back Button...");
		String  removedPage2 =browserHistory.pop();
		System.out.println(removedPage2 + " removed");
		
		String currentPage = browserHistory.peek();
		System.out.println("Current page is → "+currentPage);
		
	}

}
