import java.util.Scanner;
public class assignment2
{
	static Scanner input = new Scanner(System.in);
	public static void main(String [] args)
	{	
		int option;
		do
		{
			System.out.println("-------> MAIN MENU (ASSIGNMENT - 2) <-------");
			
			System.out.println("1 -  QUESTION 1");
			System.out.println("2 -  QUESTION 2");
			System.out.println("3 -  QUESTION 3");
			System.out.println("4 -  QUESTION 4");
			System.out.println("5 -  QUESTION 5");
			
			System.out.println("Press Option (1 - 5) to execute the program and press 0 to Exit");
			System.out.println("Enter Your Option: ");
			option = input.nextInt();
			
			switch(option)
			{
				case 1:
					Q1();
					break;
				case 2:
					Q2();
					break;
				case 3:
					Q3();
					break;
				case 4:
					Q4();
					break;
				case 5:
					Q5();
					break;
				case 0:
					System.out.println("Exiting The Program");
					return;
				default:
					System.out.println("Enter between 1 to 5");
			}
		}
		while(option != 0);
	}
	public static void Q1()
	{
		boolean repeat = true;
		String ssn;
		do
		{
			System.out.println("-------> EXECUTING QUESTION - 1 <-------");
			
			System.out.println("Enter A SSN : ");
			ssn = input.next();
			if (validSSN(ssn))
			{
				System.out.println(ssn + " Is A Valid SSN");
			}
			else
			{
				System.out.println(ssn + " Is Not A Valid SSN");
			}
			System.out.println("Do you want to execute this Question Again then Press (y) Otherwise Press 0 (b) to go to main menu");
			System.out.println("Enter your choice : ");
			char choice = input.next().charAt(0);
			
			if (choice == 'y' || choice == 'Y')
			{
				repeat = true;
			}
			else if ((choice == 'b' || choice == 'B') || choice == '0')
			{
				repeat = false;
			}
			else
			{
				System.out.println("Invalid entry Returning to main menu");
				repeat = false;
			}
		}
		while (repeat);
	}
	public static boolean validSSN(String ssn)
	{
		if (ssn.length() != 11)
		{
			return false;
		}
		else
		{
			for (int i = 0; i < ssn.length(); i++)
			{
				if ( i == 3 || i == 6 )
				{
					if ( ssn.charAt(i) != '-')
					{
						return false;
					}
				}
				else
				{
					if (!Character.isDigit(ssn.charAt(i)))
					{
						return false;
					}		
				}
			}
			return true;	
		}
	}
	public static void Q2()
	{
		boolean repeat = true;
		do
		{
			String major = "";
			String status = "";
			
			System.out.println("-------> EXECUTING QUESTION - 2 <-------");
			
			System.out.println("Enter two Characters : "); 
			String ms = input.next();
			if ( ms.length() != 2 )
			{
				System.out.println("Invalid Entry");
			}
			else
			{
				char A = ms.charAt(0);
				char B = ms.charAt(1);
				
				switch (A)
				{
					case 'M':
					case 'm':
						major = "Mathmatics";
						break;
					case 'C':
					case 'c':
						major = "Computer Science";
						break;
					case 'I':
					case 'i':
						major = "Information Technology";
						break;
					default:
						major = "Invalid";
						break;
				}
				
				switch (B)
				{
					case '1':
						status = "Freshman";
						break;
					case '2':
						status = "Sophomore";
						break;
					case '3':
						status = "Junior";
						break;
					case '4':
						status = "Senior";
						break;
					default:
						status = "Invalid";
						break;
				}
				
			}
			if (major == "Invalid" || status == "Invalid")
			{
				System.out.println("Invalid Entry ");
			}
			else
			{
				System.out.println(major + " " + status);
			}
	
			System.out.println("Do you want to execute this Question Again then Press (y) Otherwise Press 0 (b) to go to main menu");
			System.out.println("Enter your choice : ");
			char choice = input.next().charAt(0);
			
			if (choice == 'y' || choice == 'Y')
			{
				repeat = true;
			}
			else if ((choice == 'b' || choice == 'B') || choice == '0')
			{
				repeat = false;
			}
			else
			{
				System.out.println("Invalid entry Returning to main menu");
				repeat = false;
			}
		}	
		while (repeat);	 
	}
	public static void Q3()
	{
		
		boolean repeat = true;
		do
		{
			String plate = "";
			
			System.out.println("-------> EXECUTING QUESTION - 3 <-------");
			
			for (int i = 0; i < 3; i++)
			{
				char letter = (char)(65 + (int)(Math.random() * 26));
				plate = plate + letter;
			}
			for (int i = 0; i < 4; i++)
			{
				int digits = (int)(Math.random() * 10);
				plate = plate + digits;
			}
			System.out.println("Plate Number : " + plate);
			
			System.out.println("Do you want to execute this Question Again then Press (y) Otherwise Press 0 (b) to go to main menu");
			System.out.println("Enter your choice : ");
			char choice = input.next().charAt(0);
			
			if (choice == 'y' || choice == 'Y')
			{
				repeat = true;
			}
			else if ((choice == 'b' || choice == 'B') || choice == '0')
			{
				repeat = false;
			}
			else
			{
				System.out.println("Invalid entry Returning to main menu");
				repeat = false;
			}
		}
		while (repeat);
	}	 
	public static void Q4()
	{
		boolean repeat = true;
		do
		{
			String binary = "";
			String newbinary = "";
			
			System.out.println("-------> EXECUTING QUESTION - 4 <-------");
			
			System.out.println("Enter A Decimal Integar : ");
			int decint = input.nextInt();
			if ( decint == 0)
			{
				System.out.println("Binary Form = 0");
				return;
			}
			int num = decint;
			while (num > 0)
			{
				int remainder = num % 2;
				binary = binary + remainder;
				num /= 2;
			} 
			for (int i = binary.length() - 1; i >= 0; i--)
			{
				char bin = binary.charAt(i);
				newbinary = newbinary + bin;
			}
			System.out.println("Binary Form = " + newbinary);	
			
			System.out.println("Do you want to execute this Question Again then Press (y) Otherwise Press 0 (b) to go to main menu");
			System.out.println("Enter your choice : ");
			char choice = input.next().charAt(0);
			
			if (choice == 'y' || choice == 'Y')
			{
				repeat = true;
			}
			else if ((choice == 'b' || choice == 'B') || choice == '0')
			{
				repeat = false;
			}
			else
			{
				System.out.println("Invalid entry Returning to main menu");
				repeat = false;
			}
		}
		while (repeat);
	}	 
	public static void Q5()
	{
		boolean repeat = true;
		int score = 0;
		do
		{
			System.out.println("-------> EXECUTING QUESTION - 5 <-------");
			
			System.out.println("---------- QUIZ ----------");
			
			System.out.println("1. The Earth's average temperature has increased over the past century.");
			System.out.println("a. True\t\tb. False\t\tc. Not sure\t\td. None");
			char q1 = input.next().charAt(0);
			if (q1 == 'a' || q1 == 'A')
			{
				score++;
			} 
			System.out.println("2. The main cause of global warming is deforestation.");
			System.out.println("a. True\t\tb. False\t\tc. Not sure\t\td. None");
			char q2 = input.next().charAt(0);
			if (q2 == 'b' || q2 == 'B')
			{
				score++;
			} 
			System.out.println("3. Renewable energy sources can help reduce global warming.");
			System.out.println("a. True\t\tb. False\t\tc. Not sure\t\td. None");
			char q3 = input.next().charAt(0);
			if (q3 == 'a' || q3 == 'A')
			{
				score++;
			} 
			System.out.println("4. Global warming effects are only temporary.");
			System.out.println("a. True\t\tb. False\t\tc. Not sure\t\td. None");
			char q4 = input.next().charAt(0);
			if (q4 == 'b' || q4 == 'B')
			{
				score++;
			} 
			System.out.println("5. The polar ice caps are melting due to global warming.");
			System.out.println("a. True\t\tb. False\t\tc. Not sure\t\td. None");
			char q5 = input.next().charAt(0);
			if (q5 == 'a' || q5 == 'A')
			{
				score++;
			} 
			System.out.println("\nYour score: " + score + " out of 5");
        		if (score == 5) 
			{
            			System.out.println("Excellent");
		        } 
			else if (score == 4) 
			{
           			 System.out.println("Very good");
		        } 
			else 
			{
        			System.out.println("Time to brush up on your knowledge of global warming.");
            			System.out.println("Some helpful websites to learn more:");
            			System.out.println("- https://climate.nasa.gov/");
            			System.out.println("- https://www.epa.gov/climate-change");
            			System.out.println("- https://www.ipcc.ch/");
            			System.out.println("- https://climate.nationalgeographic.com/");
        		}
			
			System.out.println("Do you want to execute this Question Again then Press (y) Otherwise Press 0 (b) to go to main menu");
			System.out.println("Enter your choice : ");
			char choice = input.next().charAt(0);
			if (choice == 'y' || choice == 'Y')
			{
				repeat = true;
			}
			else if ((choice == 'b' || choice == 'B') || choice == '0')
			{
				repeat = false;
			}
			else
			{
				System.out.println("Invalid entry Returning to main menu");
				repeat = false;
			}
		}
		while (repeat);
	}	 
}			