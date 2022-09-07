//Isabella Terick
//Lab 2 : Decomposing Money
package edu.pitt.assignment1;

//importing packages
import javax.swing.JOptionPane;

public class Lab2_Problem3 
{
	public static void main(String[] args) 
	{
		//asking user for amount of money & converting it to an int
		String str1 = JOptionPane.showInputDialog("Enter a number representing an amount of money from 1 to 9999:");
		int money = Integer.parseInt(str1);
		
		//declaring remainder
		int remain;
		
		//finding how many grands
		int grand = money / 1000;
		remain = money % 1000;
		
		//finding how many Benjamins
		int ben = remain / 100;
		remain = remain % 100;
		
		//finding how many sawbucks
		int sawb = remain / 10;
		remain = remain % 10;
		
		//finding how many bucks
		int bucks = remain;
		
		//printing output
		JOptionPane.showMessageDialog(null, grand +" grands, "+ben+" Benjamins, "+sawb+" sawbucks, "+bucks+" bucks" );
		
		
	}

}
