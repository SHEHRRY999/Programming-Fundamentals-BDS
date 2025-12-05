import java.util.Scanner;
public class lab3{
	public static void main(String[] args){
	int a,b,c;
	int desk;
	Scanner input = new Scanner (System.in);
	System.out.println("enter the number of student in a:");
	a = input.nextInt();
	System.out.println("enter the number of student in b:");
	b = input.nextInt();
	System.out.println("enter the number of student in c:");
	c = input.nextInt();
	desk = (a+b+c)/2;
	System.out.println(desk+1);
	}
}


