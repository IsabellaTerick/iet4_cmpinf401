package iet4_MenuManager;

//importing libraries
import java.util.ArrayList;
import java.util.Random;

/**
 * Class MenuRandomize
 * @author Isabella
 * @created: 10/31/2022
 */
public class MenuRandomize 
{
	//creating private variables
	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;
	
	/**
	 * Constructor for MenuRandomize class
	 * @param entreeFile
	 * @param sideFile
	 * @param saladFile
	 * @param dessertFile
	 */
	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile)
	{
		//reading in options through fileManager
		entrees = FileManager.readEntrees(entreeFile);
		sides = FileManager.readSides(sideFile);
		salads = FileManager.readSalads(saladFile);
		desserts = FileManager.readDesserts(dessertFile);
	}
	
	/**
	 * Method randomMenu
	 * @return a Menu object
	 */
	public Menu randomMenu()
	{
		//creating random object
		Random rand = new Random();
	
		//getting random numbers for all parts of menu
		int entreeNum = rand.nextInt(5);
		int sideNum = rand.nextInt(5);
		int saladNum = rand.nextInt(5);
		int dessertNum = rand.nextInt(5);
		
		//creating a menu object with values we just got
		Menu m = new Menu("Bits n Bytes Diner",entrees.get(entreeNum),sides.get(sideNum),salads.get(saladNum), desserts.get(dessertNum));
		
		//returning Menu object
		return m;
	}
}
