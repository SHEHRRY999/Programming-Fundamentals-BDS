import java.util.Scanner;
public class labtask5{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the weight of the package");
		int weight = input.nextInt();
		if (weight <= 2)
			System.out.print("Rate is 1.10$");
		else if (weight >= 2 && weight < 6)
			System.out.print("Rate is 2.20$");
		else if (weight >= 6 && weight < 10 )
			System.out.print("Rate is 3.70$");
		else 
			System.out.println("Rate is 3.80$");
	}
}