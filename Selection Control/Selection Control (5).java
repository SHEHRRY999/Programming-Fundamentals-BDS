import java.util.Scanner;
public class LabTask3i {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.print("Enter N: ");
	int N=input.nextInt();
	int zeroCount=0;
	int i =0;
	while(i<N) {
		int num=input.nextInt();
		if(num==0) {
		zeroCount++; }
		i++; }
	input.close();
	System.out.print("Number of zeroes: " +zeroCount);
	}
}
	
	