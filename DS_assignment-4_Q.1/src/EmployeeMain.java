import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class EmployeeMain 
{
	public static void main(String args[])
	{
		Scanner scan  = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		System.out.println("Enter the no. of employees you want to add: ");
		int number = scan.nextInt();
		System.out.println("Enter the details: ");
		for(int index=0; index<number; index++)
		{
			System.out.println("Enter the name: ");
			String name = scan.next();
			System.out.println("Enter the address: ");
			String address = scan.next();
			Employee employee = new Employee(name, address);
			employees.add(employee);
		}
		Collections.sort(employees, new EmployeeSort());
		System.out.println("employee list is: ");
		System.out.println(employees);

		scan.close();
	}
}
