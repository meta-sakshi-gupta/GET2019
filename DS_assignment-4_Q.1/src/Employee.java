public class Employee
{
	private static int id = 0;
	
	private int empId;
	private String name;
	private String address;

	public Employee(String name, String address)
	{
		this.name = name;
		this.address = address;
		this.empId = getUniqueId();
	}

	private int getUniqueId() 
	{
		return ++id;
	}

	public int getId() 
	{
		return empId;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String toString()
	{
		return "[id=" + this.empId + ", name=" + this.name + ", address=" + this.address + "]";
	}
}

