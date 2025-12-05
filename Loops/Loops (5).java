import java.util.Scanner;
public class lab65{
	public static void main(String [] args){
		int year,sday;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the year :");
		year = input.nextInt();
		System.out.println("Enter the starting day of the week");
		sday = input.nextInt();

		int dayinmonth=0;
		int dayinweek = sday ;

		for (int month = 1;month <= 12;month++){
			System.out.println();
			if (month==1){
				System.out.println("\n	January" + year);}
			else if (month==2){
				System.out.println("\n	February" + year);}
			else if (month==3){
				System.out.println("\n	march" + year);}
			else if (month==4){
				System.out.println("\n	April" + year);}
			else if (month==5){
				System.out.println("\n	May" + year);}
			else if (month==6){
				System.out.println("\n	June" + year);}
			else if (month==7){
				System.out.println("\n	July" + year);}
			else if (month==8){
				System.out.println("\n	August" + year);}
			else if (month==9){
				System.out.println("\n	September" + year);}
			else if (month==10){
				System.out.println("\n	October" + year);}
			else if (month==11){
				System.out.println("\n	November" + year);}
			else if (month==12){
				System.out.println("\n	December" + year);}

			System.out.println("----------------------------------");

			System.out.println(" Sun Mon Tue Wed Thur Fri Sat ");
			
			if (month == 1 || month == 3 || month == 5|| month == 7|| month == 8|| month == 10 || month == 12){
				dayinmonth=31;}
			else if (month == 4 || month == 6 || month == 9|| month == 11){
				dayinmonth = 30;}
			else if (month == 2){
				if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
					dayinmonth=29;}
				else
					dayinmonth=28;

			}
			for (int space=0;space < dayinweek; space++){
				System.out.print("    ");
				}

			for ( int i= 1; i<= dayinmonth; i++){
				if (i<10){
					System.out.print("   "+ i);}
				else 
					System.out.print("  "+ i);
				
				dayinweek++;
                		if (dayinweek == 7) {  // Move to next line after Saturday
                    			dayinweek = 0;
                    			System.out.println();}
                }
			
			dayinweek = (dayinweek) % 7;
		}
			
			System.out.println();

			
		
	}
}