package linecomparison;

import java.util.Scanner;


public class linecomparison {
	
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
			
		String Length_Line1 = String.valueOf(Lenght1);
		String Length_Line2 = String.valueOf(Lenght2);
		
		int comparision=Length_Line1.compareTo(Length_Line2);
		System.out.println("Comparision of Line1 & Line2 = " +comparision);
		if(comparision==0)
		{
			System.out.println("Lenght of Line1 "+Lenght1+" is equal to Lenght of Line2 "+Lenght2 );
		}
		else if(comparision<0)
		{
			System.out.println("Lenght of Line1 "+Lenght1+" is less than Lenght of Line2 "+Lenght2 );
		}
		else
		{
			System.out.println("Lenght of Line1 = "+Lenght1+" is greater than Lenght of Line2 = "+Lenght2 );
		}
		
		
	}
		
}