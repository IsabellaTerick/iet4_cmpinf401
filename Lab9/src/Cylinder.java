
public class Cylinder extends Circle
{
	//private variables
	private double height;
	
	//constructor for Cylinder
	public Cylinder()
	{
		super();
		height = 1.0;
	}
	
	//constructor for Cylinder
	public Cylinder(double radius, double height)
	{
		super(radius);
		this.height = height;
	}
	
	//constructor for Cylinder
	public Cylinder(double radius, double height, String color)
	{
		super(radius,color);
		this.height = height;
	}
	
	//method that gets height
	public double getHeight()
	{
		return height;
	}
	
	//method that sets height
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	//method that gets the volume of the cylinder
	public double getVolume()
	{
		return Math.PI * Math.pow(getRadius(),2) * height;
	}
}
