import java.util.Scanner;
public class labtask4{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of integer A"); 
		int A = input.nextInt();
		System.out.println("Enter the value of integer B"); 
		int B = input.nextInt();
		if (A>B){
			System.out.println("A is greater than B :");}
		else 
			System.out.println("The value between A to B are : "); 
			while (A <= B ){
				System.out.println(A);
				A++;
		}
	}
} 