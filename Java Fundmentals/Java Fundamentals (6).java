import java.util.Scanner;
public class lab34{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		int x , y , z ;
		System.out.println("Enter integer X:");
		x = input.nextInt();
		System.out.println("Enter integer Y:");
		y = input.nextInt();
		
		if ( x > y)
			System.out.println("The smaller interger is Y:" + y );
		else	
			System.out.println("The smaller integer is X:" + x);
		input.close();
	}
}