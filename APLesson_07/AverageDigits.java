import java.util.Scanner;
public class AverageDigits
{
	static int number;
	static int digits;
	static double average;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		avDigits();
		System.out.println("The average of the digits in " + number + " is " + average);
	}
	
	public static void avDigits()
	{
		average = 0;
		digits = 0;
		int num = number;
		while(num > 0)
		{
			digits += 1;
			average += num%10;
			num /= 10;
		}
		average = average/digits;
	}
}