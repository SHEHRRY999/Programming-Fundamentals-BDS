import java.util.Scanner;
public class Q8
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter A Sentence");
		String str = input.nextLine();
        	int first = str.indexOf('h');
        	int last = str.lastIndexOf('h');
        	String result = str.substring(0, first) + str.substring(last + 1);
        	System.out.println(result);
	}
}
    