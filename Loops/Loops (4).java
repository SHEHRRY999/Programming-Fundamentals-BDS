import java.util.Scanner;
public class lab64{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the pattern of your choice:");
		int pat = input.nextInt();
		if (pat ==1){
			for (int i = 1; i<3;i++){
			
				for (int j=1;j<3;j++){
					System.out.println("*********");
					}
			}
		}
		else if (pat==2){
			for (int i = 1;i<=5;i++){
			
				for (int j=1;j<=i;j++){
					System.out.print("*");
					}
			
				System.out.println();
				}
		}
		else if (pat ==3){
			for (int i = 1;i<=5;i++){
				for (int space=1;space <= 5-i;space++)
					System.out.print(" ");
				for (int j=1;j<=i;j++){
					System.out.print("*");
				}
			
				System.out.println();
				}
			}
		else if (pat == 4){
			for (int i = 1; i <= 6; i++) {
            
 				for (int space = 1; space <= 6 - i; space++) {
                			System.out.print(" ");
            					}

            
            			for (int num = 1; num <= (2 * i - 1) ; num++) {
                			System.out.print(i);
            				}
			System.out.println();
				}
			}		
		}
	}