import java.util.Scanner;
public class Q9
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = input.nextLine();
	        int first = str.indexOf('h');
        	int last = str.lastIndexOf('h');	        
	        String before = str.substring(0, first + 1); 
        	String middle = str.substring(first + 1, last).replace('h', 'H');
        	String after = str.substring(last); 
	        System.out.println(before + middle + after);
	}
}
    