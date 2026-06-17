package JAVA_DAY_14;
import java.util.*;
public class STACK_BROWSER_BACK_BUTTON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> browserHistory = new Stack<>();
		browserHistory.push("google.com");
		browserHistory.push("youtube.com");
		browserHistory.push("github.com");
		browserHistory.push("hackerrank.com");
		browserHistory.push("leetcode.com");
		System.out.println("Visited websites:");
		for(String websites:browserHistory)
		{
			System.out.println(websites);
		}
		
		System.out.println("\nPressing Back Button...\n");
		
		String removedPage1 = browserHistory.pop();
		String removedPage2 = browserHistory.pop();
		
		System.out.println("Removed pages:\n"+removedPage1+"\n"+removedPage2);
		String currentPage = browserHistory.peek();
		System.out.println("\nCurrent page:\n"+currentPage);
		
	}

}
