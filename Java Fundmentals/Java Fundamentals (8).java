import java.util.Scanner;
public class lab34c{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		int x , y , z ;
		System.out.println("Enter integer X:");
		x = input.nextInt();
		System.out.println("Enter integer Y:");
		y = input.nextInt();
		System.out.println("Enter integer z:");
		z = input.nextInt();
	
		
		if ( x> y && y > z && x > z)
			System.out.println(" z is the smallest" + z);
		else if (y > x && z > x && y>z )
			System.out.println(" x is the smallest" + x);
		else if (z > x && y > x && z>x )
			System.out.println(" x is the smallest" + x);

		else if ( x>y && z>y)
			System.out.println(" y is the smallest" + y);


		
		input.close();
	}
}