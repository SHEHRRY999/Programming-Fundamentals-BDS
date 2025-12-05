import java.util.Scanner;
public class lab63{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		int seq = 0;
		int i = 0;
		int pre =input.nextInt();
		for(;;){
			seq=input.nextInt();
			if (seq==0){
				break;}
			if (seq > pre ){
				i++;}
			pre = seq;
			}
		System.out.println("The  values in sequence greater than previous  are " + i);
		}
	}