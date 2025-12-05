import java.util.Scanner;
public class lab74{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the length and width of rectangle1:");
		System.out.println("Enter the  width of rectangle1:");
		int width1 = input.nextInt();
		System.out.println("Enter the length of rectangle1:");
		int length1 = input.nextInt();
		System.out.println("Enter the length and width of rectangle2:");
		System.out.println("Enter the width of rectangle1:");
		int width2 = input.nextInt();
		System.out.println("Enter the length of rectangle1:");
		int length2 = input.nextInt();

		int area1 = length1 * width1;
		int area2 = length2* width2;
		
		if ( area1 == area2)
			System.out.println("Same area :" + area1 );
		else if ( area1 > area2)
			System.out.println(" Area of first rectangle is greater:" + area1);
		else if (area2 > area1)
			System.out.println("Area of second rectangle is greater :" + area2 );
		input.close();
	}
}