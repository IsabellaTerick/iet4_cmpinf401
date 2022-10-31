package iet4_MenuManager;
/**
 * Class Menu
 * @author Isabella Terick
 * Created: 10/05/2022
 */

//creating class description for Menu class
public class Menu 
{
	//creating variables & objects for Menu class
	private String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Dessert dessert;

	//constructor with only name
	public Menu(String name)
	{
		this.name = name;
		this.entree = null;
		this.side = null;
		this.salad = null;
		this.dessert = null;
	}

	//constructor with only name, entree, and side
	public Menu(String name, Entree entree, Side side)
	{
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = null;
		this.dessert = null;
	}

	//constructor with name, entree, side, salad, and dessert
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert)
	{
		this.name = name; 
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}

	//method that sums the calories of all the parts of the menu
	public int totalCalories()
	{
		//creating variable that will store the total number of calories
		int totalCal = 0;
		
		//adding total calories together after checking that it was not empty
		if(entree != null)
			totalCal += entree.getCalories();
		if(side != null)
			totalCal += side.getCalories();
		if(salad != null)
			totalCal += salad.getCalories();
		if(dessert != null)
			totalCal += dessert.getCalories();

		return totalCal; //returning total number of calories
	}

	//method that concatenates the descriptions of the parts of the menu
	public String description()
	{
		//creating variable that will hold concatenated string
		String desc = "";

		//creating variables that will hold description for each of their classes
		String entreeStr = "";
		String sideStr = "";
		String saladStr = "";
		String dessertStr = "";

		//assigning values to these variables - if empty, assign "N/A" to them
		if(entree == null)
			entreeStr = "N/A";
		else
			entreeStr = entree.getDescription();
		if(side == null)
			sideStr = "N/A";
		else
			sideStr = side.getDescription();
		if(salad == null)
			saladStr = "N/A";
		else
			saladStr = salad.getDescription();
		if(dessert == null)
			dessertStr = "N/A";
		else
			dessertStr = dessert.getDescription();

		//combining together
		desc ="Entree: "+ entree.getName() +". " +entreeStr + "\nSide: " + side.getName() +". "+ sideStr + "\nSalad: " + salad.getName() +". "+ saladStr 
				+ "\nDessert: " + dessert.getName() +". "+ dessertStr;

		return desc; //returning description
	}

	//getter for name
	public String getName() {
		return name;
	}

	//setter for name
	public void setName(String name) {
		this.name = name;
	}

	//getter for Entree
	public Entree getEntree() {
		return entree;
	}

	//setter for Entree
	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	//getter for Salad
	public Salad getSalad() {
		return salad;
	}

	//setter for Salad
	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	//getter for Side
	public Side getSide() {
		return side;
	}

	//setter for Side
	public void setSide(Side side) {
		this.side = side;
	}

	//getter for Dessert
	public Dessert getDessert() {
		return dessert;
	}

	//setter for Dessert
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}


}
