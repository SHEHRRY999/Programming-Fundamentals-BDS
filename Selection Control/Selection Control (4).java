import java.util.Scanner;
public class labtask3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int user = input.nextInt();
		
		if ( user > 0){
		
			System.out.println("The number is positive!");
			if (user % 2 == 0)
				System.out.println("The number is even");
			else 
				System.out.println("The number is odd");
			}
		else if (user < 0)
			System.out.println("The number is negative!");		
		else 
			System.out.println("The number is zero");
		input.close();
		}
	}