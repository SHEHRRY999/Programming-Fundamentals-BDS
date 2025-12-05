import java.util.Scanner;
public class Q1
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in); 
		final double radius = 6371.01;        
       		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        	double x1 = input.nextDouble();
        	double y1 = input.nextDouble();        		
        	System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        	double x2 = input.nextDouble();
        	double y2 = input.nextDouble();
        	double lat1 = Math.toRadians(x1);
        	double lon1 = Math.toRadians(y1);
		double lat2 = Math.toRadians(x2);
        	double lon2 = Math.toRadians(y2);
        	double distance = radius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));            	                 	
        	System.out.println("The distance between the two points is " + distance + " km");
	}
}
    