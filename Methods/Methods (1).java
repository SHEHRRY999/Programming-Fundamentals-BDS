import java.util.Scanner;
public class task2
{
        public static void main(String [] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter an integar");
            int num = input.nextInt();
            int rev = reverse(num);
            System.out.println("Reversed " + rev);
            if(isPalindrome(num))
            {
                System.out.println("Number is a palindrome");
            }
            else
            {
                System.out.println("Number is not a palindrome");
            }
        }
        public static int reverse(int n)
        {
            int rem;
            int reversed = 0;
            while (n != 0)
            {
              rem = n % 10;
              reversed = reversed * 10 + rem;
              n /= 10;
            }
            return reversed; 
        }
        public static boolean isPalindrome(int n)
        {
           return n == reverse(n);
        }
}