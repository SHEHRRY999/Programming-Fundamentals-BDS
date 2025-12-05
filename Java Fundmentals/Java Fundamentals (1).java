import java.util.Scanner;
public class lab94{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int dollars,pennies,nickel,dimes,quater;
		double Quater,Dime,Nickel,Penny;
		Quater = 0.25;
		Dime =0.10;
		Nickel=0.05;
		Penny=0.01;
		
		System.out.println("Enter the number of pennies:");
		pennies = input.nextInt();
		System.out.println("Enter the number of dimes:");
		dimes = input.nextInt();
		System.out.println("Enter the number of nickel:");
		nickel = input.nextInt();
		System.out.println("Enter the number of quater :");
		quater = input.nextInt();
		
		
		double sum = (pennies*Penny) + (dimes*Dime) + (nickel*Nickel) + (Quater*quater);
		if (sum == 1.0 )
			System.out.println("You Won");
		else 
			System.out.println("You lose: " + sum + "Dollare" );
				



	}
}