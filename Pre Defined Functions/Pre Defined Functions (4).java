import java.util.Scanner;
public class Q3a
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a decimal value (0 to 15): ");
        	int num = input.nextInt();
		String hexDigits = "0123456789ABCDEF";
		if (num >= 0 && num <= 15) 
		{
    			System.out.println("The hex value is " + hexDigits.charAt(num));
		} 
		else 
		{
    			System.out.println(num + " is an invalid input");
		}
	}
}
    