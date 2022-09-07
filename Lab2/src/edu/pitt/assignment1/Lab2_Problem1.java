//Isabella Terick
//Lab 2 : Pythagorean Theorem
package edu.pitt.assignment1;

//importing JOptionPane in order to get user input later
import javax.swing.JOptionPane;

public class Lab2_Problem1 
{
	public static void main(String[] args) 
	{
		//asking for user to input variables & changing these to numbers
		String str1 = JOptionPane.showInputDialog("Enter one side of the triangle:");
		String str2 = JOptionPane.showInputDialog("Enter the other side of the triangle:");
		double side1 = Double.parseDouble(str1);
		double side2 = Double.parseDouble(str2);

		//creating double for hypotenuse & calculating value
		double hypo = Math.sqrt((Math.pow(side1, 2)+Math.pow(side2, 2)));
		
		//rounding value to second decimal
		hypo = hypo * 100;
		int r = (int)Math.round(hypo);
		hypo = r /100.0;
		
		//displaying result
		JOptionPane.showMessageDialog(null, "The hypotenuse is "+hypo);
	}

}
