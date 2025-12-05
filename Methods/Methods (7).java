import java.util.Scanner;
public class task8
{
        public static void main(String [] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a String");
            String str = input.nextLine();
            int vowels = countVowels(str);
            System.out.println("Number of Vowels " + vowels);
        }
        public static int countVowels(String s) 
        {
            int count = 0;
            for(int i = 0; i < s.length(); i++)
            {
                switch(s.charAt(i))
                {
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                        count ++;
                    default:
                        break;
                }
            }
            return count;
        }
}