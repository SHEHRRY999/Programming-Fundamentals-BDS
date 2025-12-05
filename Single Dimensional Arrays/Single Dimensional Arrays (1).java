import java.util.Scanner;
public class task2
{

    public static void main(String [] args)
    {
        
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] afterModify = Modify(arr);
        for(int i = 0; i < afterModify.length; i++)
            System.out.print(afterModify[i] + " \t");
    }
    public static int [] Modify(int [] array)
    {
        int [] arrmodify = new int [10];
        for(int i = 0; i < array.length; i++)
        {
            arrmodify [i] = array [i] * 3; 
        }
        return arrmodify;
    }
}