Pseudo code :
    START

Create a Stack called browserHistory

Push "google.com" into browserHistory
Push "youtube.com" into browserHistory
Push "github.com" into browserHistory
Push "wikipedia.org" into browserHistory
Push "stackoverflow.com" into browserHistory

Display "Visited Websites:"
Display browserHistory

Display "Pressing Back Button..."

Remove the top website from browserHistory
Store it in removedPage1

Remove the next top website from browserHistory
Store it in removedPage2

Display "Removed Page 1: " + removedPage1
Display "Removed Page 2: " + removedPage2

Get the current top website using peek()
Store it in currentPage

Display "Current Page: " + currentPage

STOP


PROGRAM:-
    import java.util.Stack;

public class BrowserHistory {

	    public static void main(String[] args) {

	        Stack<String> browserHistory = new Stack<>();

	        browserHistory.push("google.com");
	        browserHistory.push("youtube.com");
	        browserHistory.push("github.com");
	        browserHistory.push("wikipedia.org");
	        browserHistory.push("stackoverflow.com");

	        System.out.println("Visited Websites:");
	        System.out.println(browserHistory);

	        System.out.println("\nPressing Back Button...");

	        String removedPage1 = browserHistory.pop();
	        String removedPage2 = browserHistory.pop();

	        System.out.println("Removed Page 1: " + removedPage1);
	        System.out.println("Removed Page 2: " + removedPage2);

	        String currentPage = browserHistory.peek();

	        System.out.println("Current Page: " + currentPage);
	    }
	}
