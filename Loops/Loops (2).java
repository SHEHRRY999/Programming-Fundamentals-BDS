import java.util.Scanner;
public class lab62{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		int seq = 0;
		int even=0;
		System.out.println("Enter the sequence ending with zero");
		for(int i=1 ;;i++){
			seq=input.nextInt();
			if (seq==0)
				break;
			if (seq%2==0)
				even++;
			}
		System.out.println("The even values in sequence are " + even);
		}
	}