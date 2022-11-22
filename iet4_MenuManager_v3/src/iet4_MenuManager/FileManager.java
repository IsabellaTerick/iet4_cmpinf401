package iet4_MenuManager;

//imports
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class FileManager
 * @author Isabella
 * @created: 10/31/2022
 */

public class FileManager 
{
	//method that goes through the data and creates menu items from a list of data
	public static ArrayList<MenuItem> readItems(String filename)
	{
		//adding filereader and buffered reader
		FileReader fr;
		try 
		{
			fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			
			//creating ArrayList
			ArrayList<MenuItem> dishes = new ArrayList<MenuItem>();
			
			//getting values from file into ArrayList
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] dishesArray = line.split("@@"); //splitting it where "@@" are
				int cal = Integer.parseInt(dishesArray[3]);
				double price = Double.parseDouble(dishesArray[4]);
				if(dishesArray[1].toLowerCase().equals("entree"))
				{
					Entree temp = new Entree(dishesArray[0], dishesArray[2], cal, price); //creating entree 
					dishes.add(temp); //adding temp to dishes ArrayList
				}
				else if(dishesArray[1].toLowerCase().equals("salad"))
				{
					Salad temp = new Salad(dishesArray[0], dishesArray[2], cal, price); //creating salad object
					dishes.add(temp); //adding temp to dishes ArrayList
				}
				else if(dishesArray[1].toLowerCase().equals("side"))
				{
					Side temp = new Side(dishesArray[0], dishesArray[2], cal, price); //creating side object
					dishes.add(temp); //adding temp to dishes ArrayList
				}
				else if(dishesArray[1].toLowerCase().equals("dessert"))
				{
					Dessert temp = new Dessert(dishesArray[0], dishesArray[2], cal, price); //creating dessert object
					dishes.add(temp); //adding temp to dishes ArrayList
				}
			}
			
			//closing files
			br.close();
			fr.close();
			
			//returning arraylist
			return dishes;
			
		} 
		catch (IOException | NumberFormatException e) //catch if there is an error
		{
			System.out.println("Error!");
			return null;
		}
	}
	
	//method that prints list of menus 
	public static void writeMenu(String filename, ArrayList<Menu> menus)
	{
		//creating filewriter
		FileWriter fw;
		try 
		{
			//creating fileWriter and BufferedWriter
			fw = new FileWriter(filename);
			BufferedWriter bw = new BufferedWriter(fw);
			
			//prints out all information of menu 
			for(int i = 0; i < menus.size(); i++)
			{
				fw.write(menus.get(i).toString() + "\n" + menus.get(i).description()+ "\nTotal Calories: " + menus.get(i).totalCalories() + "\n\n");
			}
			
			//closing files
			bw.close();
			fw.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	

}
