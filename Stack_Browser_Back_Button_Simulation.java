import java.util.Stack;

public class Stack_Browser_Back_Button_Simulation {
    public static void main(String[] args) {

        Stack<String> browserHistory = new Stack<>();

        // Push websites into the stack
        browserHistory.push("google.com");
        browserHistory.push("youtube.com");
        browserHistory.push("github.com");
        browserHistory.push("wikipedia.org");
        browserHistory.push("stackoverflow.com");

        // Display all visited websites
        System.out.println("Visited Websites: " + browserHistory);

        System.out.println("\nPressing Back Button...");

        // Remove top two websites
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
