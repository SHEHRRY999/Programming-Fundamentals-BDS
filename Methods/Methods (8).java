import java.util.Scanner;
public class task1
{
        public static void main(String [] args)
        {
            Scanner input = new Scanner(System.in);
            int sum = sumDigits(234);
            System.out.println("Sum of digits in an integar 234 is " + sum);
            System.out.println("Enter an integar");
            int revi = input.nextInt();
            reverse(revi); 
        }
        public static int sumDigits(int n)
        {
            int rem;
            int s = 0;
            while (n != 0)
            {
              rem = n % 10;
              n /= 10;
              s = s + rem; 
            }
            return s; 
        }
        public static void reverse(int n)
        {
           int rem;
           while (n != 0)
           {
               rem = n % 10;
               n /= 10;
               System.out.print(rem);
           }
           
        }
}