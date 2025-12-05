import java.util.Scanner;
public class Q10
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Word ");
		String str = input.nextLine();
        	System.out.println(str.charAt(2));
        	System.out.println(str.charAt(str.length() - 2));    
        	System.out.println(str.length() < 5 ? str : str.substring(0,5));
        	System.out.println(str.substring(0, str.length() - 2));        
        	String even = "";
        	for (int i = 0; i < str.length(); i += 2) 
		{
        		even = even + str.charAt(i);
        	}
        	System.out.println(even);
        	String odd = "";
        	for (int i = 1; i < str.length(); i += 2) 
		{
                	odd = odd + str.charAt(i);
        	}
        	System.out.println(odd);
        	System.out.println(new StringBuilder(str).reverse());
	        String reverseEven = "";
        	for (int i = str.length() - 1; i >= 0; i -= 2) 
		{
            		reverseEven = reverseEven + str.charAt(i);
        	}
        	System.out.println(reverseEven);
	        System.out.println(str.length());
	}
}
    