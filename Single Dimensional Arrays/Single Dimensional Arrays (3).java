import java.util.Scanner;
public class task1 
{
    public static void main(String [] args)
    {
        int excellent=0;
        int awful=0;
        Scanner input = new Scanner(System.in);
        int [] responses = new int [10];
        System.out.println("Enter your responses");
        for(int i = 0; i < responses.length; i++)
        {
            responses[i] = input.nextInt();
            if(responses[i] > 5 && responses[i] <= 10)
            {
                excellent++;
            }
            else if(responses[i] <= 5 && responses[i] >= 1)
            {
                awful++;
            }
            else
            {
                System.out.println("Enter a value between 1 and 10");
                i = i - 1;
            }
        }
        if(excellent > awful)
        {
            System.out.println("Excellent");
        }
        else if(excellent < awful)
        {
            System.out.println("Awful");
        }
        else
        {
            System.out.println("Normal");
        }
        input.close();
    }

}
