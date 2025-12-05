import java.util.Scanner;
public class labtask4c{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of number you want to enter ");
		int N=input.nextInt();
		int i=0;
		int num;
		int sum=0;
		while (i<N){
			System.out.println("Enter the integer"+i);
			num=input.nextInt();
			sum +=num;
			i++;
			}
		System.out.println("The sum of "+ N+"number is :" + sum);
		}
	}
		