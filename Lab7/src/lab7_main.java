//Isabella Terick 
//Lab 7 

//importing
import java.util.Scanner;
import java.util.Random;

public class lab7_main 
{
	//main 
	public static void main(String[] args) 
	{
		//declaring Scanner & Random
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		//declaring variables
		int num = 0;
		
		//getting user input
		System.out.println("How many items do you want to enter?");
		num = scan.nextInt();
		
		//creating array
		double[] data = new double[num];
		
		//filling the array with randomly generated values
		for(int i = 0; i < num; i++)
		{
			double temp = rand.nextDouble();
			data[i] = temp;
		}
		
		//calculating and printing values using above methods
		double max = max(data);
		double min = min(data);
		double sum = sum(data);
		double average = ave(data);
		
		System.out.println("The maximum value is "+max+".");
		System.out.println("The minimum value is "+min+".");
		System.out.println("The sum is "+sum+".");
		System.out.println("The average is "+average+".");
	}
	
	//method that returns the maximum value in the array
	public static double max(double[] data)
	{
		double tempMax = -100;
		
		for(int i = 0; i < data.length; i++)
		{
			if(tempMax < data[i])
			{
				tempMax = data[i];
			}
		}
		
		return tempMax;
	}
	
	//method that returns the minimum value in the array
	public static double min(double[] data)
	{
		double tempMin = 100;
		
		for(int i = 0; i < data.length; i++)
		{
			if(tempMin > data[i])
			{
				tempMin = data[i];
			}
		}
		
		return tempMin;
	}
	
	//method that sums the items in the array and returns the result
	public static double sum(double[] data)
	{
		double tempSum = 0;
		
		for(int i = 0; i < data.length; i++)
		{
			tempSum += data[i];
		}
		
		return tempSum;
	}
	
	//method that returns the average of the array
	public static double ave(double[] data)
	{
		double temp = sum(data);
		double average = temp/data.length;
		return average;
	}

}
