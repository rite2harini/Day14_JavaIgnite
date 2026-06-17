package JAVA_DAY_14;
import java.util.*;
public class QUEUE_TOKEN_MANAGEMENT_SYSTEM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> patientQueue = new LinkedList<>();
		//Adding patients in queue using offer()
		patientQueue.offer("HOMELANDER");
		patientQueue.offer("BILLY BUTCHER");
		patientQueue.offer("HUGHIE");
		patientQueue.offer("FRINCHIE");
		patientQueue.offer("SOLDIER BOY");
		
		System.out.println("Patients in the queue order: ");
		int i=1;
		for(String name:patientQueue)
		{
			System.out.println(i+"."+name);
			i++;
		}
		System.out.println("Serving the first patient: "+patientQueue.peek());
		String servedPatient = patientQueue.poll();
		System.out.println("Served patients: "+servedPatient);
		System.out.println("Remaining patients in queue:");
		i=1;
		for(String name:patientQueue)
		{
			System.out.println(i+"."+name);
			i++;
		}
		
	}

}
