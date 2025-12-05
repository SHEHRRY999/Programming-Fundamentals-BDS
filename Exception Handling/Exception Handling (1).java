import java.util.*;
public class task2
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    int choice = 1;
    while(choice == 1)
    {
        try 
        {
            System.out.println("Enter 10 Integars ");
            int [] arr = new int [10];
            for(int i = 0; i < arr.length; i++)
            {
                arr [i] = input.nextInt();
            }
            System.out.println("Enter index Of Array Element");
            int index = input.nextInt();
            int num = arr[index];
            System.out.println("ARRAY ELEMENT AT INDEX " + index + " is " + num);
            System.out.println("Enter 1 for repeating execution");
            choice = input.nextInt();
            if(choice != 1)
            {
                break;
            }
        } 
        catch (InputMismatchException ex) 
        {
            System.out.println("Enter Integars ");
            System.out.println("Try Again ");
            input.nextLine();
        }
        catch (ArrayIndexOutOfBoundsException ex2)
        {
            System.out.println("Enter Valid Index ");
            System.out.println("Try Again ");
            input.nextLine();
        }
    
    }

  }
}