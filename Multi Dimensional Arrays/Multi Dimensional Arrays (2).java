import java.util.Scanner;
public class task2
{
    public static boolean isPrime(int n) 
    {
        if (n <= 1) 
        {
            return false;
        }
        for (int i = 2; i * i <= n; i++) 
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int [][] matrix = new int[3][4];
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Enter array elements of row " + (i + 1));
            for(int j = 0; j < 4; j++)
            {
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("The original matrix is:");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int maxRowPrime = 0;
        int maxRowIndex = 0;
        for (int j = 0; j < 4; j++)
        {
            if (isPrime(matrix[0][j]))
            {
                maxRowPrime++;
            }
        }
        for (int i = 1; i < 3; i++)
        {
            int primeCount = 0;
            for (int j = 0; j < 4; j++)
            {
                if (isPrime(matrix[i][j]))
                {
                    primeCount++;
                }  
            }

            if (primeCount > maxRowPrime)
            {
                maxRowPrime = primeCount;
                maxRowIndex = i;
            }
        }
        int maxColPrime = 0;
        int maxColIndex = 0;
        for (int i = 0; i < 3; i++)
        {
            if (isPrime(matrix[i][0]))
            {
                maxColPrime++;
            }               
        }
        for (int j = 1; j < 4; j++)
        {
            int primeCount = 0;
            for (int i = 0; i < 3; i++)
            {
                if (isPrime(matrix[i][j]))
                { 
                    primeCount++;
                }
            }
            if (primeCount > maxColPrime)
            {
                maxColPrime = primeCount;
                maxColIndex = j;
            }
        }
        System.out.println("\nRow with maximum prime numbers = Row " + (maxRowIndex + 1) + " (Prime Count = " + maxRowPrime + ")");
        System.out.println("Column with maximum prime numbers = Column " + (maxColIndex + 1) + " (Prime Count = " + maxColPrime + ")");
                           
    }
}                       