import java.util.Scanner;
public class lab54{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int x ,y,z;
		System.out.println("Enter the value of x");	
		x = input.nextInt();
		System.out.println("Enter the value of y");	
		y = input.nextInt();
		System.out.println("Enter the value of z");	
		z = input.nextInt();
		
		if ( x == y && x != z && y != z)
			System.out.println("there are two equal number " + x +"   " + y);
		else if ( x == z && x != y && z != y)
			System.out.println("there are two equal number " + x + "   " + z);
		else if ( y == z && x != y && x != z)
			System.out.println("there are two equal number " + y  + "   " + z);

		if ( x==y &&  y==z)
			System.out.println("all equal");
		}
}