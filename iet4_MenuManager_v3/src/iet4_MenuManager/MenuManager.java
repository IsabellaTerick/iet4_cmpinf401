package iet4_MenuManager;

import java.util.ArrayList;
import java.util.Random;

//creating class description for MenuManager
public class MenuManager 
{
	//creating private variables
	private ArrayList<Entree> entrees = new ArrayList<Entree>();
	private ArrayList<Side> sides = new ArrayList<Side>();
	private ArrayList<Salad> salads = new ArrayList<Salad>();
	private ArrayList<Dessert> desserts = new ArrayList<Dessert>();

	//constructor for MenuManager
	public MenuManager(String dishesFile)
	{
		//reading in MenuItems into an array
		ArrayList<MenuItem> items = new ArrayList<MenuItem>();
		items = FileManager.readItems(dishesFile);

		//separating the arraylist into separate arraylist
		for(int i = 0; i < items.size(); i++)
		{
			if(items.get(i) instanceof Entree)
			{
				entrees.add((Entree) items.get(i));
			}
			else if(items.get(i) instanceof Side)
			{
				sides.add((Side)items.get(i));
			}
			else if(items.get(i) instanceof Salad)
			{
				salads.add((Salad)items.get(i));
			}
			else if(items.get(i) instanceof Dessert)
			{
				desserts.add((Dessert)items.get(i));
			}
		}
	}

	//method that creates random menus
	public Menu randomMenu(String name)
	{
		Random rand = new Random();

		//getting entree
		int entreeLoc = rand.nextInt(entrees.size());

		//getting side
		int sideLoc = rand.nextInt(sides.size());

		//getting salad
		int saladLoc = rand.nextInt(salads.size());

		//getting dessert
		int dessertLoc = rand.nextInt(desserts.size());

		//creating Menu Item
		Menu temp = new Menu(name, entrees.get(entreeLoc), sides.get(sideLoc), salads.get(saladLoc), desserts.get(dessertLoc));

		//returning random menu
		return temp;
	}

	//method that creates the minimum calorie menu
	public Menu minCaloriesMenu(String name)
	{
		//creating minimum calories values
		int minEntree = 10000;
		int minSide = 100000;
		int minSalad = 10000;
		int minDessert = 10000;

		//creating minimum calories location
		int entreeLoc = 0;
		int sideLoc = 0;
		int saladLoc = 0;
		int dessertLoc = 0;

		//searching through entree array for minimum
		for(int i = 0; i < entrees.size(); i++)
		{
			if(entrees.get(i).getCalories() < minEntree)
			{
				minEntree = entrees.get(i).getCalories();
				entreeLoc = i;
			}
		}

		//searching through side array for minimum 
		for(int i = 0; i < sides.size(); i++)
		{
			if(sides.get(i).getCalories() < minSide)
			{
				minSide = sides.get(i).getCalories();
				sideLoc = i;
			}
		}

		//searching through salad array for minimum 
		for(int i = 0; i < sides.size(); i++)
		{
			if(salads.get(i).getCalories() < minSalad)
			{
				minSalad = salads.get(i).getCalories();
				saladLoc = i;
			}
		}

		//searching through dessert array for minimum 
		for(int i = 0; i < desserts.size(); i++)
		{
			if(desserts.get(i).getCalories() < minDessert)
			{
				minDessert = desserts.get(i).getCalories();
				dessertLoc = i;
			}
		}

		//creating minimum calorie Menu item
		Menu temp = new Menu (name, entrees.get(entreeLoc), sides.get(sideLoc), salads.get(saladLoc), desserts.get(dessertLoc));

		//returning minimum calorie menu
		return temp;
	}

	//method that returns maximum calorie menu
	public Menu maxCaloriesMenu(String name)
	{
		//creating maximum calories values
		int maxEntree = 0;
		int maxSide = 0;
		int maxSalad = 0;
		int maxDessert = 0;

		//creating maximum calories location
		int entreeLoc = 0;
		int sideLoc = 0;
		int saladLoc = 0;
		int dessertLoc = 0;

		//searching through entree array for maximum
		for(int i = 0; i < entrees.size(); i++)
		{
			if(entrees.get(i).getCalories() > maxEntree)
			{
				maxEntree = entrees.get(i).getCalories();
				entreeLoc = i;
			}
		}

		//searching through side array for maximum 
		for(int i = 0; i < sides.size(); i++)
		{
			if(sides.get(i).getCalories() > maxSide)
			{
				maxSide = sides.get(i).getCalories();
				sideLoc = i;
			}
		}

		//searching through salad array for maximum
		for(int i = 0; i < sides.size(); i++)
		{
			if(salads.get(i).getCalories() > maxSalad)
			{
				maxSalad = salads.get(i).getCalories();
				saladLoc = i;
			}
		}

		//searching through dessert array for maximum
		for(int i = 0; i < desserts.size(); i++)
		{
			if(desserts.get(i).getCalories() > maxDessert)
			{
				maxDessert = desserts.get(i).getCalories();
				dessertLoc = i;
			}
		}

		//creating maximum calorie Menu item
		Menu temp = new Menu (name, entrees.get(entreeLoc), sides.get(sideLoc), salads.get(saladLoc), desserts.get(dessertLoc));

		//returning maximum calorie menu
		return temp;
	}

	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}

	public ArrayList<Side> getSides() {
		return sides;
	}

	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}

	public ArrayList<Salad> getSalads() {
		return salads;
	}

	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}

	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}



}
