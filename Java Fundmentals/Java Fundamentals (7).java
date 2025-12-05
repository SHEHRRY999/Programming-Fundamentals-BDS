import java.util.Scanner;
public class lab34b {
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Input the value of x");
		double x = input.nextDouble();
		
		if(x==0)
			System.out.println("zero");
		else if ( x<0 )
			System.out.println("negative -1 ");
		else
			System.out.println("postive 1");
	}
}