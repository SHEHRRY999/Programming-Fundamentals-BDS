import java.util.Scanner;
public class lab7{
	public static void main (String [] args){
		int ca=20;
		int cb=15;
		int cc=10;
		int cd=5;
		int Ca;
		int Cb;
		int Cc;
		int Cd;
		int total;

		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter total number of tickets sold for class A;");
		Ca = input.nextInt();
		System.out.println("Enter total number of tickets sold for class B;");
		Cb = input.nextInt();
		System.out.println("Enter total number of tickets sold for class C;");
		Cc = input.nextInt();
		System.out.println("Enter total number of tickets sold for class D;");
		Cd = input.nextInt();
		
		total = (Ca*ca)+(Cb*cb)+(Cc*cc)+(Cd*cd);
		System.out.println("The total bill for all classes is:" + total);
	}
}

