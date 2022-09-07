//Isabella Terick
//Lab 2 : Area and Perimeter of a Circle
package edu.pitt.assignment1;

//importing packages
import javax.swing.JOptionPane;

public class Lab2_Problem2 
{

	public static void main(String[] args) 
	{
		//asking the user to input radius of circle & converting it to double
		String str1 = JOptionPane.showInputDialog("Enter the radius of a circle:");
		double radius = Double.parseDouble(str1);
		
		//declaring perimeter and area variables
		double peri, area;
		
		//computing values for perimeter and area
		peri = Math.PI * 2 * radius;
		area = Math.PI * radius * radius;
		
		//limiting amount of decimals to two
		peri = peri * 100;
		int r = (int)Math.round(peri);
		peri = r/100.0;
		
		area = area * 100;
		int s = (int)Math.round(area);
		area = s/100.0;
		
		//printing output of calculations
		JOptionPane.showMessageDialog(null, "The circle with radius "+radius+" has an area of "
				+area + " and a perimeter of "+peri);
	}

}
