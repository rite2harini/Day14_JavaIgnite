package JavaIgniteDay14;
import java.util.Scanner;
import java.util.*;
public class Queue_Token_Management_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<String> patientQueue = new LinkedList<>();
		int num,i;
		String name,firstServed;
		System.out.println("Enter the number of pateint :");
		num = sc.nextInt();
		sc.nextLine();
		for(i=0;i<num;i++) {
			System.out.println("Enter the name :");
			name = sc.nextLine();
			patientQueue.offer(name);
		}
		System.out.println("The names are : \n"+patientQueue);
		firstServed = patientQueue.poll();
		System.out.println("Now served : "+firstServed);
		System.out.println("Remaining are : \n" +patientQueue);
		sc.close();
	}
}
