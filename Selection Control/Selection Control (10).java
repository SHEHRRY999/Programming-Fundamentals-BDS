import java.util.Scanner;
public class labtask4d{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of number you want to enter ");
		int N=input.nextInt();
		int i=1;
		int num;
		int sum=0;
		int cube=1;
		while (i<=N){
			cube = i*i*i;
			sum +=cube;
			i++;}
		System.out.println("The sum of cube of "+N+"integer is "+sum);
	}
}