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
