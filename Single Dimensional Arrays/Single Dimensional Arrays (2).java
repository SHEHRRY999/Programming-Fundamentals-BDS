import java.util.Scanner;
public class task3
{
    /*Write a program to copy the contents of one array into another in the reverse order.*/
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int [] arr = new int [10];
        System.out.println("Enter array elements");
        for(int i = 0; i < arr.length; i++)
        {
            arr [i] = input.nextInt();
        }
        int [] reversed = Reverse(arr);
        for(int i = 0; i < reversed.length; i++)
        {
            System.out.print(reversed [i] + " ");
        }
        input.close();
    }
    public static int [] Reverse(int [] array)
    {
        int [] arrreversed = new int [10];
        for(int i = 0; i < array.length; i++)
        {
            arrreversed [i] = array [array.length - 1 - i]; 
        }
        return arrreversed;
    }
}