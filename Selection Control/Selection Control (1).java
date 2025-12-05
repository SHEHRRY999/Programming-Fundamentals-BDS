import java.util.Scanner;

public class labtask1{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 0,1,2for rock,paper,scissor");
		int user = input.nextInt();
		int rock = 0;
		int paper= 1;
		int scicorr=2;
		int computer = (int)(Math.random()*3);
		System.out.println("Your Choice:"+ user +"Computer Choice:" + computer );
		if (user == computer){
			System.out.println("its a draw");}
		else if ( user == 0 && computer == 2){
			System.out.println("YOU WON!");}
		else if ( user == 1 && computer == 0){
			System.out.println("YOU WON!");}
		else if ( user == 2 && computer == 1){
			System.out.println("YOU WON!");}
		else
			System.out.println("Computer WON!");
		input.close();
	}
}