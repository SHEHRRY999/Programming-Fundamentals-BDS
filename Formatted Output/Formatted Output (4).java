import java.util.Scanner;
public class lab6{
	public static void main(String[]args){
		double rate = 15.50;
		double taxrate=0.14;
		double exp1=0.10;
		double exp2=0.01;
		double bond=0.25;
		double parents=0.50;
		double prate;
		int hour;
		double pay;
		double tax;
		double tpay;
		double exp1r,exp2r,exp3b;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your payrate for summer job in dollars:");
		prate= input.nextDouble();
		System.out.println("Enter your hour for summer job:");
		hour = input.nextInt();
		pay = prate * hour;
		System.out.println("Your pay for summer job before tax is:" + pay );
		tax = taxrate * pay;
		tpay = pay - tax ;
		System.out.println("Your pay for summer job after tax is:" +tpay);
		exp1r = (tpay*exp1);
		tpay = tpay - exp1r;
		exp2r = (tpay*exp2);
		tpay = tpay - exp2r;
		exp3b = (tpay*bond);
		
		System.out.println("The amount you spend on clothes and accesories is :" + exp1r);
		System.out.println("The amount you spend on school supplies is :"+ exp2r);
		System.out.println("The amount you spend on saving bond is:"+ exp3b);
		System.out.println("The amount your parent spend on bond is "+ parents);
	}
}


		
				