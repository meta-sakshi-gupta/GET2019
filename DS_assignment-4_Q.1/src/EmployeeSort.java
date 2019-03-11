import java.util.Comparator;


public class EmployeeSort implements Comparator<Employee>
{
	@Override 
	public int compare(Employee emp1, Employee emp2)
	{
		return emp1.getName().compareToIgnoreCase(emp2.getName());	
	}
}
