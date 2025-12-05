import java.util.Scanner;
	public class labtask1{
		public static void main (String [] args ){
			double amount;
			Scanner input = new Scanner (System.in);
			System.out.println("Enter the amount in form of Dollars and cent");
			amount = input.nextDouble();
			double cents =  amount * 100.0 ;
			System.out.println("cents are; "+ cents);
			double dollars = cents/100.0;
			System.out.println("dollars are; "+dollars);
			cents = cents % 100.0;
			double quaters = cents / 25;
			System.out.println("quater are; "+ quaters);
			cents = cents % 25.0;
			double dimes  = cents /10;
			System.out.println("dimes are; "+dimes);
			cents = cents % 10.0;
			double nickles = cents/ 5;
			cents = cents % 5;
			System.out.println("nickles are; " + nickles);
			double pennies = cents ;
			

			
			
			
			
			
			System.out.println("pennies are; "+pennies);

	}
}
			
			