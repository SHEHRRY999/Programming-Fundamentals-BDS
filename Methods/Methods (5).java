import java.util.Scanner;
public class task6
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
        	String str = input.nextLine();
       	 	String result = "";
        	int i = 0;
        	while (i < str.length()) 
		{
            		int start = i;
            		while (i < str.length() && str.charAt(i) != ' ') 
			{
                		i++;
            		}
            		String word = str.substring(start, i);
            		if (result.length() > 0) 
				result += " "; 
            		result += capitalize(word);
            		i++;
        	}
        	System.out.println(result);
	}
    	public static String capitalize(String word) 
	{
        	if (word.length() == 0) 
		{
            		return "";
        	} 
		else 
		{
            		return Character.toUpperCase(word.charAt(0)) + word.substring(1);
        	}
    	}
}