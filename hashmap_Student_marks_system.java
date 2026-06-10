package JavaIgniteDay14;
import java.util.Scanner;
import java.util.*;
public class Hashmap_Student_marks_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,String> students = new HashMap<>();
		int num,i,id,searchid;
		String name;
		System.out.println("Enter the number of students :");
		num = sc.nextInt();
		sc.nextLine();
		for(i=0;i<num;i++) {
			System.out.println("Enter the name of the student:");
			name = sc.nextLine();
			System.out.println("Enter the id of the student :");
			id = sc.nextInt();
			sc.nextLine();
			students.put(id, name);
		}
		System.out.println("The details are :");
		System.out.println(students);
		System.out.println("Enter the id for searching of students: ");
		searchid = sc.nextInt();
		if(students.containsKey(searchid)) {
			System.out.println("Student found :");
			System.out.println(students.get(searchid));
		}
		else {
			System.out.println("No student found...invalid id");
		}
		sc.close();
	}

}
