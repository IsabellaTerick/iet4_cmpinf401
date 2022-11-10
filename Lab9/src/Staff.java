//class definition for Staff
public class Staff extends Person
{
	//private variables for staff
	private String school;
	private double pay;
	
	//constructor for Staff
	public Staff(String name, String address, double pay)
	{
		setName(name);
		setAddress(address);
		this.pay = pay;
	}
	
	//method that gets school
	public String getSchool()
	{
		return school;
	}
	
	//method that sets school
	public void setSchool(String school)
	{
		this.school = school;
	}
	
	//method that gets pay
	public double getPay()
	{
		return pay;
	}
	
	//method that sets pay
	public void setPay(double pay)
	{
		this.pay = pay;
	}
	
	//method that writes out information
	public String toString()
	{
		String str1 = "Name: "+getName()+"\nAddress: "+getAddress()+"\nSchool: "
				+school+"\nPay: "+pay;
		return str1;
	}
}
