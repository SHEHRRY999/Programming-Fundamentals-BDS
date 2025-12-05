import java.util.Scanner;
public class task5
{
        public static void main(String [] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a String");
            String str = input.next();
            int letters = countLetters(str);
            System.out.println("Number of letters " + letters);
        }
        public static int countLetters(String s) 
        {
            int count = 0;
            for(int i = 0; i < s.length(); i++)
            {
                if(Character.isLetter(s.charAt(i)))
                {
                    count ++;
                }
            }
            return count;
        }
}