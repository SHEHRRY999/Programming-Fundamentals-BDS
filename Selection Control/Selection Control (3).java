import java.util.Scanner;
public class LabTask2i {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer n: ");
        int n = input.nextInt();
        input.close();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers."); }
         else {
            long factorial = 1;
            int i = 1;
            while (i <= n) {
                factorial *= i;
                i++;
            }
            System.out.println(n + "! = " + factorial);
        }
    }
}
