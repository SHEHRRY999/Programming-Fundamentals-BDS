import java.util.Scanner;

public class lab84{

	public static void main (String[] args){

		Scanner input = new Scanner (System.in);
		int month, date, year;
		System.out.println("Enter the month in numeric type:");
		month = input.nextInt();
		System.out.println("Enter the date in numeric typ");
		date = input.nextInt();
		System.out.println("Enter the year in two digits : ");
		year=input.nextInt();
		int product = month * date;
		if (product == year)
			System.out.println("THE DATE IS MAGIC!");
		else
			System.out.println("NO MAGIC DATE!");
		input.close();

	}
}
