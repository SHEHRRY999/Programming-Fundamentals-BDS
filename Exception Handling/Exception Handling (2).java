import java.util.*;
public class task1
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    int choice = 1;
    while(choice == 1)
    {
        try
        {
            
            System.out.println("Enter two Numbers: ");
            int a = input.nextInt();
            int b = input.nextInt();
            int sum = a + b;
            System.out.println("SUM : " + sum);
            System.out.println("Enter 1 for repeating execution ");
            choice = input.nextInt();
            if(choice != 1)
            {
                break;
            }
        }
        catch(InputMismatchException ex)
        {
            System.out.println("You must enter integars ");
            System.out.println("Try Again");
            input.nextLine();
        }
    }
  }
}