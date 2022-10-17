//Lab 6
public class MyRectangle 
{
	//declaring instance variables
	private int width;
	private int height;
	private int startX;
	private int startY;
	
	//default constructor - initialize all values to 0
	public MyRectangle()
	{
		width = 0;
		height = 0;
		startX = 0;
		startY = 0;
	}
	
	//initialize all values based on parameters
	public MyRectangle(int x, int y, int w, int h)
	{
		width = w;
		height = h;
		startX = x;
		startY = y;
	}
	
	//return area of this rectangle
	public int area()
	{
		return width * height;
	}
	
	//converting values to a string
	public String toString()
	{
		StringBuilder S = new StringBuilder();
		S.append(" Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}
	
	//returns true if the point is inside the borders of the rect, false otherwise
	public boolean isInside(int x, int y)
	{
		if((x >= startX && x <= startX + width) && (y >= startY && y <= startY + height))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//update width and height
	public void setSize(int w, int h)
	{
		width = w;
		height = h;
	}
	
	//update startX and startY
	public void setPosition(int x, int y)
	{
		startX = x;
		startY = y;
	}
	
}
