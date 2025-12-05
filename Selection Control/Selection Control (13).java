import java.util.Scanner;
public class LabTask5i {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int num;
	boolean a = true;
        while (a) {
            num =input.nextInt();
            if (num == 0) 
		a= false;
            if (num > max) 
	    max = num;	}
        input.close();
        if (max == Integer.MIN_VALUE) {
            System.out.println("Sequence is empty.");
        } else {
            System.out.println("Maximum element: " + max);
        }
    }
}