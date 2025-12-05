import java.util.Scanner;
public class lab64{
	public static void main (String [] args ){
	Scanner input = new Scanner (System.in);
	System.out.println("Enter a number from 1 - 10");
	int num = input.nextInt();
	
	switch (num) {
	case 1: System.out.println("Roman one");
			break;
	case 2: System.out.println("Roman two");
			break;
	case 3: System.out.println("Roman three");
			break;
	case 4: System.out.println("Roman four");
			break;
	case 5: System.out.println("Roman five");
			break;
	case 6: System.out.println("Roman six");
			break;
	case 7: System.out.println("Roman seven");
			break;
	case 8: System.out.println("Roman eight");
			break;
	case 9: System.out.println("Roman nine");
			break;
	case 10: System.out.println("Roman ten");
			break;
	default: System.out.println("INVALID INPUT");
		}
	}
}