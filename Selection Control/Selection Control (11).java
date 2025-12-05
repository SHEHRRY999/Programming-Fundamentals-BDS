import java.util.Scanner;
public class LabTask4i {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = 0;
	boolean a = true;
        while (a) {
            int num =input.nextInt();
            if (num == 0)
		a=false;
            length++; }
        input.close();
        System.out.println(length);
    }
}