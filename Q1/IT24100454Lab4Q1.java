import java.util.Scanner;

public class IT24100454Lab4Q1 
{
	public static void main(String[] args)
	{
		Scanner abc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int no = abc.nextInt();
		
		if (no > 0)
		{
			System.out.print("The number is:positive");
		}
		else if (no < 0)
		{
			System.out.println("The number is:negative");
		}
		else
		{
			System.out.println("The number is zero");
		}
}
}