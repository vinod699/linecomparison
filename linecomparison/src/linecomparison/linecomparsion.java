package linecomparison;
import java.util.Scanner;


public class linecomparsion {
	
	public static void main(String args[]) {
	
		// variables
		double x1, y1, x2, y2; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter co-ordinates of First Line : ");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		
		double Lenght1 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		System.out.println("Length of Line1 : "+Lenght1) ;
		
		System.out.println("Enter co-ordinates of Second Line : ");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		
		double Lenght2 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		System.out.println("Length of Line2 : "+Lenght2) ;
		
		if(Double.compare(Lenght1,Lenght2)==0)
		
			System.out.println("Length of Line 1 = Lenght of Line 2");
		else
			System.out.println("Length of Line 1 != Lenght of Line 2");
	}
		
}