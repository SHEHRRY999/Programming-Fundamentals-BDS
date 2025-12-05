import java.util.Scanner;
public class Q6
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two words");		 
		String str = input.nextLine();
        	int spaceIndex = str.indexOf(" ");
        	String firstWord = str.substring(0, spaceIndex);
        	String secondWord = str.substring(spaceIndex + 1);
        	System.out.println(secondWord + " " + firstWord);
	}
}
    