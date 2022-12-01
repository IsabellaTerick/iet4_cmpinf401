//Lab 10
public class Lab10_Main 
{
	//method that returns the sum of the digits of an integer
	public static int sumOfDigits(int x)
	{
		//creating sum variable to store sum of digits
		int sum = 0;
		
		//if number is negative - making it positive
		if(x < 0)
		{
			x = x * -1;
		}
		
		//test case to continue program
		if(x/10 > 0)
		{
			sum += sumOfDigits(x/10);
		}
		
		sum += x%10;
		return sum;
	}
	
	//method that prints all the elements of an array of integers, 
	//one per line. 
	public static void printArrayElements(int a[], int index)
	{
		//test case
		if(index < a.length)
		{
			System.out.println(a[index]); //prints value
			printArrayElements(a, index + 1); //calls function recursively
		}
	}
	
	//method that finds all the distinct combinations of a given length
	public static void printCombos(int[] a, String out, int startIndex, int k)
	{
		
		//making sure that it is not going out of bounds
		if(startIndex + k < a.length)
		{
			//creating temp string 
			String temp = "";
			temp += a[startIndex];
			
			if(a[startIndex+1] > a[startIndex])
			{
				
			}
		}
		
		//printing out string with all the combos
		if(startIndex + k == a.length)
		{
			System.out.println(out);
		}
		
		
	}
	
	//main
	public static void main(String[] args) 
	{
		//test for sumOfDigits
		int sum = sumOfDigits(234);
		System.out.println(sum);
		
		//test for printArrayElements
		int[] a = {1, 2, 3, 4, 5};
		printArrayElements(a, 0);
		
		//test for printCombos
		int[] b = {2, 3, 6, 8, 9};
		String out = "";
		printCombos(b, out, 0, 3);
	
		

	}

}
