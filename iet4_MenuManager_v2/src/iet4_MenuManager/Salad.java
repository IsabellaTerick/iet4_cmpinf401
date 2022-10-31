package iet4_MenuManager;

//creating class description for Salad class
public class Salad 
{
	//declaring variables for Salad class
	private String name;
	private String description;
	private int calories;
	
	//constructor for Salad class
	public Salad(String name, String desc, int cal)
	{
		this.name = name;
		this.description = desc;
		this.calories = cal;
	}

	//getter for name
	public String getName() {
		return name;
	}

	//setter for name
	public void setName(String name) {
		this.name = name;
	}

	//getter for description
	public String getDescription() {
		return description;
	}

	//setter for description
	public void setDescription(String description) {
		this.description = description;
	}

	//getter for calories
	public int getCalories() {
		return calories;
	}

	//setter for calories
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
}
