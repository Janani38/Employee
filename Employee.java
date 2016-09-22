import java.io.*;

public class Employee {

	public static void main(String args[]) throws IOException

	{
		// to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// accept employee details
		System.out.println("Enter id:");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter First_name:");
		String First_name = br.readLine();
		System.out.println("Enter Last_name:");
		String Last_name = br.readLine();
		System.out.println("Enter Designation:");
		String Designation = br.readLine();
		// display employee details
		System.out.println("Employee Details is: ");
		System.out.println("id=" + id);
		System.out.println(" Employee First_name=" + First_name);
		System.out.println(" Employee Last_name=" + Last_name);
		System.out.println(" Employee Last_name=" + Designation);

	}
}