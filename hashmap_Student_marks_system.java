package JAVA_DAY_14;
import java.util.HashMap;
import java.util.Scanner;

public class STUDENT_MARK_SYSTEM {
	
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        HashMap<Integer, String> students = new HashMap<>();
       
        students.put(1009, "STWATRA");
        students.put(1012, "SUBHENDU");
        students.put(1023, "BALDEV");
        students.put(1044, "HRUSHIKESH");
        students.put(1056, "GURUDUTTA");
       
        System.out.println("Student Records:");
        for (Integer id : students.keySet()) {
            System.out.println("ID: " + id + "  Name: " + students.get(id));
        }     
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Student ID: ");
        int studentId = sc.nextInt();       
        if (students.containsKey(studentId)) {

            String studentName = students.get(studentId);

            System.out.println("Student Name: " + studentName);

        } else {

            System.out.println("Student Not Found");

        }

        sc.close();
    }
}
