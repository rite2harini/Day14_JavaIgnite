public class StudentMarksLookupSystem {
	    public static void main(String[] args) {

	        // Create HashMap
	        HashMap<Integer, String> students = new HashMap<>();

	        // Add student records
	        students.put(101, "John");
	        students.put(102, "Priya");
	        students.put(103, "Rahul");
	        students.put(104, "David");
	        students.put(105, "Anu");

	        // Display all student records
	        System.out.println("Student Records:");
	        System.out.println(students);

	        // Take Student ID as input
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Student ID: ");
	        int id = sc.nextInt();

	        // Check if ID exists
	        if (students.containsKey(id)) {
	            String studentName = students.get(id);
	            System.out.println("Student Name: " + studentName);
	        } else {
	            System.out.println("Student Not Found");
	        }

	        sc.close();
	    }
	}


