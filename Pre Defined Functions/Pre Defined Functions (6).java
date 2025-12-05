public class Q4
{
	public static void main(String args[])
	{
		int randomIndex = (int) (Math.random() * 26);
        	char randomChar = (char) ('A' + randomIndex);       
        	System.out.println("Random uppercase letter: " + randomChar);
	}
}
    