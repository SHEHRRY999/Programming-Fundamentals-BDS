import java.util.Scanner;
public class Q2b
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a character: ");
        	char ch = input.next().charAt(0); // Gets first character of input
        	int code = (int) ch;
        	System.out.println("The Unicode for the character " + ch + " is " + code);
	}
}
    