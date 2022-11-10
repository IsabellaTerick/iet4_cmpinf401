//description for Circle Class
public class Circle 
{
	//private variables
	private double radius;
	private String color;
	
	//constructor for Circle class
	public Circle()
	{
		radius = 5.0;
		color = "Green";
	}
	
	//constructor for Circle class
	public Circle(double radius)
	{
		this.radius = radius;
		color = "Green";
	}
	
	//constructor for Circle class
	public Circle(double radius, String color)
	{
		this.radius = radius;
		this.color = color;
	}
	
	//method that returns the radius
	public double getRadius()
	{
		return radius;
	}
	
	//method that sets the radius
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	//method that gets the color
	public String getColor()
	{
		return color;
	}
	
	//method that sets teh color
	public void setColor(String color)
	{
		this.color = color;
	}
	
	//method that returns the area of the circle
	public double getArea()
	{
		return Math.PI *(Math.pow(radius,2));
	}
}
