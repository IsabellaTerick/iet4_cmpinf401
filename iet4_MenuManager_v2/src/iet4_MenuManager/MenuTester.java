package iet4_MenuManager;

/**
 * Class MenuTester
 * @author Isabella
 * @created: 10/31/2022
 */
public class MenuTester {

	//main method
	public static void main(String[] args)
	{
		MenuRandomize randomize = new MenuRandomize("data\\entrees.txt",
			"data\\sides.txt","data\\salads.txt","data\\desserts.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories: "+
			myMenu.totalCalories());
	}

}
