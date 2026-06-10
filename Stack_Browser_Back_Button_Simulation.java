package JavaIgniteDay14;
import java.util.*;
public class Back_button_simulation {

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
