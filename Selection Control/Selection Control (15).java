import java.util.Scanner;
public class labtask6{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of package ");
		int pack = input.nextInt();
		if (pack >= 10 && pack <= 19)
			System.out.println("Discount is 20%");
		else if (pack >= 10 && pack <= 19)
			System.out.println("Discount is 30%");
		else if (pack >= 10 && pack <= 19)
			System.out.println("Discount is 40%");
		else
			System.out.println("Discount is 50%");
	}
}
