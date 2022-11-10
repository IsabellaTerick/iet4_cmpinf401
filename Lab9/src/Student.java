//class definition for Student
public class Student extends Person
{
	//private variables for Student class
	private String program;
	private int year;
	private double fee;
	
	//constructor for Student class
	public Student(String name, String address, String program, int year, double fee)
	{
		setName(name);
		setAddress(address);
		this.program = program;
		this.year = year;
		this.fee = fee;	
	}
	
	//method that returns program
	public String getProgram()
	{
		return program;
	}
	
	//method that sets program
	public void setProgram(String program)
	{
		this.program = program;
	}
	
	//method that gets year
	public int getYear()
	{
		return year;
	}
	
	//method that sets year
	public void setYear(int year)
	{
		this.year = year;
	}
	
	//method that gets fee
	public double getFee()
	{
		return fee;
	}
	
	//method that sets fee
	public void setFee(double fee)
	{
		this.fee = fee;
	}
	
	//method that writes out information
	public String toString()
	{
		String str1 = "Name: "+getName()+"\nAddress: "+getAddress()+"\nProgram: "+program
				+"\nYear: "+year+ "\nFee: "+fee;
		return str1;
	}
}
