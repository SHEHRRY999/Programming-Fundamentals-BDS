import java.util.Scanner;

public class task3
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][4];
        int[][] B = new int[4][3];
        int[][] C = new int[3][3]; 
        System.out.println("Enter elements for 3x4 Matrix A:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 4; j++) 
            {
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter elements for 4x3 Matrix B:");
        for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                B[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                C[i][j] = 0; 
                for (int k = 0; k < 4; k++) 
                {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Result of Matrix Multiplication (3x3):");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}