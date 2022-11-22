//defining class for MenuItem
package iet4_MenuManager;

public class MenuItem 
{
	//defining private variables
	private String name;
	private String description;
	private int calories;
	private double price;
	
	//creating MenuItem method
	public MenuItem(String name, String desc, int cal, double price)
	{
		this.name = name;
		description = desc;
		calories = cal;
		this.price = price;
	}

	//getter for price
	public double getPrice() {
		return price;
	}

	//setter for price
	public void setPrice(double price) {
		this.price = price;
	}
	
	//overriding the toString method
	public String toString()
	{
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

}
