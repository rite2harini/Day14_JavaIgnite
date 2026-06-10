package JavaIgniteDay14;
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
			System.out.println("Enter the name of the student :");
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
