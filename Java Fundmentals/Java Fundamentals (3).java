
public class lab14{
	public static void main(String [] args){
		
		int x = 10;
		int y = 15;
		int z = 20;
		
		boolean ep1=!(x>10);
		boolean ep2=(x <= 5) || (y < 15) ;
		boolean ep3=(x != 5)&&(y!= z);	
		boolean ep4=(x>=z) || (x+y >= z);
		boolean ep5=(x<= y-2) && (y>=z)||(z-2 != 20);
	
		System.out.println("Expression 1 : !(x>10)" + ep1);
		System.out.println("Expression 2 : (x <= 5) || (y < 15)" + ep2 );		
		System.out.println("Expression 3 : (x>=z) || (x+y >= z)" + ep3);
		System.out.println("Expression 4 : (x>=z) || (x+y >= z)" + ep4);
		System.out.println("Expression 5 : (x<= y-2) && (y>=z)||(z-2 != 20)" + ep5);
	}
}