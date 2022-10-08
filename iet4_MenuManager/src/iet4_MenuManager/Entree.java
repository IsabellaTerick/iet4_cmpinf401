package iet4_MenuManager;
/**
 * Class Entree
 * @author Isabella Terick
 * Created: 10/05/2022
 */

//creating class description for Entree class
public class Entree 
{
	//creating variables to be used in this class
	private String name;
	private String description;
	private int calories;

	//creating constructor for Entree class
	public Entree(String name, String desc, int cal)
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