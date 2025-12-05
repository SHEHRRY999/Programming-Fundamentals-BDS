import java.util.Scanner;
public class lab8{
	public static void main (String[]args){
		int a;
		int sum;
		int p1;
		int p2;
		int p3;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter an Integer between 1 - 1000");
		a = input.nextInt();
		p1= a/100;
		p2=(a%100)/10;
		p3=(a%100)%10;
		sum= p1 + p2 + p3 ;
		System.out.println("The sum of the digits of integer is:" + sum);
	}
}
		