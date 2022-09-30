//Isabella Terick
//Lab 5: Rolling dice and comparing experimental and expected probabilities

import java.util.Random;
import java.util.Scanner;

public class diceDriver 
{
	
	//creating variables that can be used in methods and main
	static int roll2 = 0;
	static int roll3 = 0;
	static int roll4 = 0;
	static int roll5 = 0;
	static int roll6 = 0;
	static int roll7 = 0;
	static int roll8 = 0;
	static int roll9 = 0;
	static int roll10 = 0;
	static int roll11 = 0;
	static int roll12 = 0;
	
	//method that will simulate rolling the dice
	public static void rollDice(int rollNum, Random rand)
	{
		//creating variables for first & second roll
		int firstRoll = 0;
		int secondRoll = 0;
		
		//for loop that gets totals for the number of rolls wanted
		for(int i = 0; i < rollNum; i++)
		{
			firstRoll = rand.nextInt(6)+1;
			secondRoll = rand.nextInt(6)+1;
			
			int temp = firstRoll + secondRoll;
			
			if(temp == 2)
				roll2++;
			if(temp == 3)
				roll3++;
			if(temp == 4)
				roll4++;
			if(temp == 5)
				roll5++;
			if(temp == 6)
				roll6++;
			if(temp == 7)
				roll7++;
			if(temp == 8)
				roll8++;
			if(temp == 9)
				roll9++;
			if(temp == 10)
				roll10++;
			if(temp == 11)
				roll11++;
			if(temp == 12)
				roll12++;
		}
		
		//printing out experimental values compared to probabilistic values
		System.out.println("Here are your final fractions from all the rolls compared to\n"
				+ "the probablistic values for each number.");
		System.out.println("For a total of 2, it appeared "+ roll2 +" time(s) and you had a fraction of "+((double)roll2/rollNum)+".\n"
				+ "Compared to the probabilistic value of "+(1.0/36)+".");
		System.out.println("For a total of 3, it appeared "+ roll3 +" time(s) and you had a fraction of "+((double)roll3/rollNum)+".\n"
				+ "Compared to the probabilistic value of "+(2.0/36)+".");
		System.out.println("For a total of 4, it appeared "+ roll4 +" time(s) and you had a fraction of "+((double)roll4/rollNum)+".\n"
				+ "Compared to the probabilistic value of "+(3.0/36)+".");
		System.out.println("For a total of 5, it appeared "+ roll5 +" time(s) and you had a fraction of "+((double)roll5/rollNum)+".\n"
				+ "Compared to the probabilistic value of "+(4.0/36)+".");
		System.out.println("For a total of 6, it appeared "+ roll6 +" time(s) and you had a fraction of "+((double)roll6/rollNum)+".\n"
				+ "Compared to the probabilistic value of "+(5.0/36)+".");
		System.out.println("For a total of 7, it appeared "+ roll7 +" time(s) and you had a fraction of "+((double)roll7/rollNum)+".\n"
				+ "Compared to the probabilistic value of "+(6.0/36)+".");
		System.out.println("For a total of 8, it appeared "+ roll8 +" time(s) and you had a fraction of "+((double)roll8/rollNum)+".\n"
				+ "Compared to the probabilistic value of "+(5.0/36)+".");
		System.out.println("For a total of 9, it appeared "+ roll9 +" time(s) and you had a fraction of "+((double)roll9/rollNum)+".\n"
				+ "Compared to the probabilistic value of "+(4.0/36)+".");
		System.out.println("For a total of 10, it appeared "+ roll10 +" time(s) and you had a fraction of "+((double)roll10/rollNum)+".\n"
				+ "Compared to the probabilistic value of "+(3.0/36)+".");
		System.out.println("For a total of 11, it appeared "+ roll11 +" time(s) and you had a fraction of "+((double)roll11/rollNum)+".\n"
				+ "Compared to the probabilistic value of "+(2.0/36)+".");
		System.out.println("For a total of 12, it appeared "+ roll12 +" time(s) and you had a fraction of "+((double)roll12/rollNum)+".\n"
				+ "Compared to the probabilistic value of "+(1.0/36)+".");
	}
	
	//main method
	public static void main(String[] args)
	{	
		//creating Scanner object
		Scanner scan = new Scanner(System.in);
		
		//creating variable for number of rolls
		int rollNum = 0;
		
		//creating Random object
		Random rand = new Random();
		
		String str1 = "";
		do
		{
			//asking for roll number and calling method
			System.out.println("How many times would you like to roll the dice?");
			rollNum = scan.nextInt();
			rollDice(rollNum, rand);
			
			//reseting the values back to zero
			roll2 = 0;
			roll3 = 0;
			roll4 = 0;
			roll5 = 0;
			roll6 = 0;
			roll7 = 0;
			roll8 = 0;
			roll9 = 0;
			roll10 = 0;
			roll11 = 0;
			roll12 = 0;
			
			//asking the user if they would like to run the program again
			System.out.println("Would you like to continue? (yes/no)");
			str1 = scan.next();
		
		}while(str1.toLowerCase().equals("yes")); //if they type yes - will run again 
		
	}
}
