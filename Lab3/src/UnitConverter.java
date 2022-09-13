//Isabella Terick
//Lab 3

//importing JOptionPane
import javax.swing.JOptionPane;

//class
public class UnitConverter 
{

	//main
	public static void main(String[] args) 
	{
		//creating user amount variable
		int loc = 0;
		double amount = 0, convert;
		String measurement;
		
		//asking for user input
		String str1 = JOptionPane.showInputDialog("Enter a distance or weight amount (ex: 8.3 yd) : ");
		
		//searching for space in a string - getting value where the space is
		int i = 0;
		for(i = 0; i < str1.length(); i++)
		{
			if((str1.charAt(i)) == ' ')
			{

				loc = i;
			}
		}
		
		//splitting up user input to separate the number the user put in 
		String str2 = str1.substring(0,loc);
		
		//changing it from string to double
		amount = Double.parseDouble(str2);
		
		//separating unit of measurement from user input
		measurement = str1.substring(loc +1,str1.length());

		//switch for measurements
		switch (measurement)
		{
			case "in": //converting inches to centimeters
			{
				convert = amount * 2.54;
				JOptionPane.showMessageDialog(null,str1+" = "+convert+" cm");
				break;
			}
			case "cm": //converting centimeters to inches
			{
				convert = amount / 2.54;
				JOptionPane.showMessageDialog(null,str1+" = "+convert+" in");
				break;
			}
			case "yd": //converting yards to meters
			{
				convert = amount / 0.9144;
				JOptionPane.showMessageDialog(null,str1+" = "+convert+" m");
				break;
			}
			case "m": //converting meters to yards
			{
				convert = amount * 0.9144;
				JOptionPane.showMessageDialog(null,str1+" = "+convert+" yd");
				break;
			}
			case "oz": //converting ounces to grams
			{	
				convert = amount * 453.59237;
				JOptionPane.showMessageDialog(null,str1+" = "+convert+" gm");
				break;
			}
			case "gm": //converting grams to ounces
			{
				convert = amount / 28.35;
				JOptionPane.showMessageDialog(null,str1+" = "+convert+" oz");
				break;
			}
			case "kg": //converting kilograms to pounds
			{
				convert = amount * 2.205;
				JOptionPane.showMessageDialog(null,str1+" = "+convert+" lb");
				break;
			}
			case "lb": //converting pounds to kilograms
			{
				convert = amount / 2.205;
				JOptionPane.showMessageDialog(null,str1+" = "+convert+" kg");
				break;
			}
			default: //default
			{
				break;
			}
		}

	}

}

