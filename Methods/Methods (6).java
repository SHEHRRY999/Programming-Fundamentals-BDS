import java.util.Scanner;
public class task7
{
        public static void main(String [] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = input.nextInt();
            printMatrix(n);  
        }
        public static void printMatrix(int num) 
        {
            for(int i = 0; i < num; i++)
            {
                for(int j = 0; j < num; j++)
                {
                    int b = (int)(Math.random() * 2);
                    System.out.print(" " + b);
                }
                System.out.println();
            }
        }
}