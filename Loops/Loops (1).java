import java.util.Scanner;
public class lab61{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sequence");
		int seqence ;
		//int num = 0;
		int max = 0;
		int maxind=0;
		
		
		for  (int  count=1; ;count++){
			seqence = input.nextInt();
			if (seqence==0)
				break;
			
			if ( seqence > max){
				max=seqence;
				maxind= count ;
				}
		}
		System.out.println("The greatest number is " + max + "and its index is " + maxind);
		input.close();
	}
}
		
			