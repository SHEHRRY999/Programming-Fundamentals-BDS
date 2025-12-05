import java.util.Scanner;
public class lab2{
	public static void main(String[]args){
		Scanner input = new Scanner (System.in);
		int N;
		int K;
		int apples;
		int baskets;
		int reminder ;
		System.out.println("Enter the number of students N:");
		N = input.nextInt();
		System.out.println("Enter the number of apples K:");
		K = input.nextInt();
		apples = K/N;
		reminder = K%N;
		baskets = reminder;
		System.out.println("Enter the number of apples students got:"+ apples);
		System.out.println("Enter the number of remaining apples:" + baskets);
	}
}

		
		