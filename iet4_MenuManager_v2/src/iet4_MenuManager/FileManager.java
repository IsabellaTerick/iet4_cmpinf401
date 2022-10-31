package iet4_MenuManager;

//imports
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class FileManager
 * @author Isabella
 * @created: 10/31/2022
 */

public class FileManager 
{
	/**
	 * Method readEntrees
	 * @param filename a String
	 * @return an ArrayList of type Entree
	 */
	public static ArrayList<Entree> readEntrees(String filename)
	{
		//adding filereader and buffered reader
		FileReader fr;
		try 
		{
			fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			
			//creating ArrayList
			ArrayList<Entree> entrees = new ArrayList<Entree>();
			
			//getting values from file into ArrayList
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] entreesArray = line.split("@@"); //splitting it where "@@" are
				int cal = Integer.parseInt(entreesArray[2]);
				Entree temp = new Entree(entreesArray[0], entreesArray[1], cal); //creating entree object
				entrees.add(temp); //adding temp to entree ArrayList
			}
			
			//closing files
			br.close();
			fr.close();
			
			//returning arraylist
			return entrees;
			
		} 
		catch (IOException | NumberFormatException e) //catch if there is an error
		{
			System.out.println("Error!");
			return null;
		}
	}
	
	/**
	 * Method readSides
	 * @param filename a String
	 * @return an ArrayList of type Sides
	 */
	public static ArrayList<Side> readSides(String filename)
	{
		//adding filereader and buffered reader
		FileReader fr;
		try 
		{
			fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			
			//creating ArrayList
			ArrayList<Side> sides = new ArrayList<Side>();
			
			//getting values from file into ArrayList
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] sidesArray = line.split("@@"); //splitting it where "@@" are
				int cal = Integer.parseInt(sidesArray[2]);
				Side temp = new Side(sidesArray[0], sidesArray[1], cal); //creating entree object
				sides.add(temp); //adding temp to side ArrayList
			}
			
			//closing files
			br.close();
			fr.close();
			
			//returning arrayList
			return sides;
		} 
		catch (IOException | NumberFormatException e) //catch if there is an erro
		{
			System.out.println("Error!");
			return null;
		}
	}
	
	/**
	 * Method readSalads
	 * @param filename a String
	 * @return an ArrayList of type Salad
	 */
	public static ArrayList<Salad> readSalads(String filename)
	{
		//adding filereader and buffered reader
		FileReader fr;
		try 
		{
			fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			
			//creating ArrayList
			ArrayList<Salad> salads = new ArrayList<Salad>();
			
			//getting values from file into ArrayList
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] saladsArray = line.split("@@"); //splitting it where "@@" are
				int cal = Integer.parseInt(saladsArray[2]);
				Salad temp = new Salad(saladsArray[0], saladsArray[1], cal); //creating entree object
				salads.add(temp); //adding temp to salad ArrayList
			}
			
			//closing files
			br.close();
			fr.close();
			
			//returning arrayList
			return salads;
			
		} 
		catch (IOException | NumberFormatException e) //catch if there is an error
		{
			System.out.println("Error!");
			return null;
		}
	}
	
	/**
	 * Method readDesserts
	 * @param filename a String
	 * @return an ArrayList of type Dessert
	 */
	public static ArrayList<Dessert> readDesserts(String filename)
	{
		//adding filereader and buffered reader
		FileReader fr;
		try 
		{
			fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			
			//creating ArrayList
			ArrayList<Dessert> desserts = new ArrayList<Dessert>();
			
			//getting values from file into ArrayList
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] dessertsArray = line.split("@@"); //splitting it where "@@" are
				int cal = Integer.parseInt(dessertsArray[2]);
				Dessert temp = new Dessert(dessertsArray[0],dessertsArray[1], cal); //creating entree object
				desserts.add(temp); //adding temp to dessert ArrayList
			}
			
			//closing files
			br.close();
			fr.close();
			
			//returning arrayList
			return desserts;
			
		} 
		catch (IOException | NumberFormatException e) //catch if there is an error
		{
			System.out.println("Error!");
			return null;
		}
	}
}
