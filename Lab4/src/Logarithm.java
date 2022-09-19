//Isabella Terick
//Lab4: Logarithm

//importing JOptionPane
import javax.swing.JOptionPane;

public class Logarithm 
{
	//main
	public static void main(String[] args) 
	{
		//declaring variables
		int num, base, ans = 0;
		
		do //error checking user input for number
		{
			String str1 = JOptionPane.showInputDialog("Please enter a number you would like to take the logarithm of.");
			num = Integer.parseInt(str1);
		}while(num < 0);
		
		do //error checking user input for base
		{
			String str2 = JOptionPane.showInputDialog("Please enter the number for the base of the logarithm.");
			base = Integer.parseInt(str2);
		}while(base < 1);
		
		//declaring temp variable to be used in loop
		int temp = num/base;
		
		while(temp > 0)
		{
			temp = temp/base;
			ans++;
		}
		
		JOptionPane.showMessageDialog(null, "Your answer is "+ans+".");
	}

}
