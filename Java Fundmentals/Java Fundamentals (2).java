import java.util.Scanner;
public class lab104{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the nmbr of book bought this month:");
		int book = input.nextInt();
		int score ;
		if(book == 1){
			score = 5;}
		else if(book == 2){
			score = 15;}
		else if(book == 3){
			score = 30;}
		else {
			score = 60;}
		System.out.println("You have earned" + score + " scores this month");
		input.close();
	}
}
		