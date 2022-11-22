package iet4_MenuManager;

import java.util.ArrayList;

/**
 * Class MenuTester
 * @author Isabella
 * @created: 10/31/2022
 */
public class MenuTester {

	//main method
	public static void main(String[] args)
	{
		/*MenuRandomize randomize = new MenuRandomize("data\\entrees.txt",
			"data\\sides.txt","data\\salads.txt","data\\desserts.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories: "+
			myMenu.totalCalories());*/
		
		MenuManager manage = new MenuManager("data\\dishes.txt");
		
		Menu m = manage.minCaloriesMenu("Bits n Bytes");
		System.out.println(m.description());
		System.out.println(m.totalCalories());
		
		Menu g = manage.maxCaloriesMenu("Diner 2");
		ArrayList<Menu> test = new ArrayList<Menu>();
		
		test.add(m);
		test.add(g);
		
		FileManager.writeMenu("data\\test.txt", test);
		
		Menu y = manage.randomMenu("Diner 3");
		System.out.println(y.description());
	}

}
