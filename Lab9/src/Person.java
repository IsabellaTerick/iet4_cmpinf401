//class definition for Person
public abstract class Person 
{
	//private variables for Person class
	private String name;
	private String address = "String";
	
	//method that gets name
	public String getName()
	{
		return name;
	}
	
	//method that gets address
	public String getAddress()
	{
		return address;
	}
	
	//method that sets address
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	//method that sets name
	public void setName(String name)
	{
		this.name = name;
	}
}
