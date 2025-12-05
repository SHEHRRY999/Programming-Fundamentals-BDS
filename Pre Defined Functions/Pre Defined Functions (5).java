import java.util.Scanner;
public class Q3b
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a hex digit: ");
        	String s = input.nextLine().toUpperCase(); 
        	String hexDigits = "0123456789ABCDEF";
       		if (s.length() != 1 || hexDigits.indexOf(s.charAt(0)) == -1) 
		{
                	System.out.println(s + " is an invalid input");
            		return;
        	}
        	int num = hexDigits.indexOf(s.charAt(0));
	        System.out.println("The binary value is " + Integer.toBinaryString(num));
	}
}
    