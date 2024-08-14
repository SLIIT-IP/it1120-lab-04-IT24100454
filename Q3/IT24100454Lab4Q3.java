import java.util.Scanner;

public class IT24100454Lab4Q3 
{
	public static void main(String[] args)
	{
		Scanner abc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int no = abc.nextInt();
		
		String msg = (no > 0)? "The number is: Positive" :(no < 0)? "The number is: Negative" : "The number is: Zero";
		System.out.print(msg);
	}
}
			