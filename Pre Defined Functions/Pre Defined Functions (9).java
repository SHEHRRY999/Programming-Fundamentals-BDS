import java.util.Scanner;
public class Q7
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = input.nextLine();
        	int first = str.indexOf('f');
        	int last = str.lastIndexOf('f');
        	if (first == -1) 
		{            
        	} 
		else if (first == last) 
		{
            		System.out.println(first);
        	} 
		else 
		{
            		System.out.println(first + " " + last);
        	}
	}
}
    