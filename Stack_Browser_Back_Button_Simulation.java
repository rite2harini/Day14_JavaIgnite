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
import java.util.Stack;

public class BrowserHistory {
    public static void main(String[] args) {

        // Create Stack
        Stack<String> browserHistory = new Stack<>();

        // Push websites into the Stack
        browserHistory.push("google.com");
        browserHistory.push("youtube.com");
        browserHistory.push("github.com");
        browserHistory.push("wikipedia.org");
        browserHistory.push("stackoverflow.com");

        // Display all visited websites
        System.out.println("Visited Websites:");
        System.out.println(browserHistory);

        // Simulate Back button
        System.out.println("\nPressing Back Button...");

        String removedPage1 = browserHistory.pop();
        String removedPage2 = browserHistory.pop();

        // Display removed pages
        System.out.println("Removed Page 1: " + removedPage1);
        System.out.println("Removed Page 2: " + removedPage2);

        // Get current page
        String currentPage = browserHistory.peek();

        // Display current page
        System.out.println("Current Page: " + currentPage);
    }
}
