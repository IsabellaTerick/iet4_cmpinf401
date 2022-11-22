package iet4_MenuManager;

//class that is meant to test the Menu project
public class MenuTest 
{
	//main
	public static void main(String[] args) 
	{
		//creating menu name
		String name = "Bits and Bytes Diner";

		/*//creating objects from each class to test them
		Entree entree1 = new Entree("Sirloin Steak", "A delicious piece of 1/2 a pound of our carefully selected meat grilled and seasoned. Choose how much you want it cooked.", 700 );
		Entree entree2 = new Entree("Garlic Herb Chicken Breast","A roasted and savory piece of our famous chicken breast. Seasoned with our secret blend of herbs.", 300);
		Side side1 = new Side("Loaded Baked Potato","A large baked potato topped with sour cream, cheese, bacon, and scallions.", 190);
		Side side2 = new Side("Wild Rice Pilaf", "A serving of toasted wild rice with sauted carrots and onions.", 50);
		Salad salad1 = new Salad("House Salad", "A salad with cherry tomatoes, onions,cheese, and croutons. Topped with our house dressing.", 90);
		Dessert dessert1 = new Dessert("New York Cheesecake", "A slice of our homemade cheesecake. Made with a buttery graham cracker crust and a creamy and rich filling.", 300);
	

		//creating Menu objects
		Menu menu1 = new Menu(name, entree1, side1);
		Menu menu2 = new Menu(name, entree2, side2, salad1, dessert1);*/

		//printing out facts about menu1
		System.out.println(menu1.getName());
		System.out.println();
		System.out.println(menu1.description());
		System.out.println();
		System.out.println("Total Calories: " +menu1.totalCalories());
		
		//printing out facts about menu2
		System.out.println(menu2.getName());
		System.out.println();
		System.out.println(menu2.description());
		System.out.println();
		System.out.println("Total Calories: " +menu2.totalCalories());
	}

}
