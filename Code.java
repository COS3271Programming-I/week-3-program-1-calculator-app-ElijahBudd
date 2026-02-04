package myProject;
import java.util.Scanner;

public class Calculator_APP {
	static Scanner userinput = new Scanner(System.in);
	public static void main (String[] args) 
	{
		double x;
		double y;
		
		System.out.print("Enter a decimal number for x: ");
		x = userinput.nextDouble();
		System.out.print("Enter a decimal number for y: ");
		y = userinput.nextDouble();
		
		Double sum = x + y;
		Double product = x * y;
		Double quotient = x / y;
		Double power = Math.pow(x,  y);
		Double logBase = Math.log(x) / Math.log(y);
		
		System.out.println("Results");
		System.out.println("x + y = " + sum);
		System.out.println("x * y = " + product);
		System.out.println("x / y = " + quotient);
		System.out.println("x^y = " + power);
		System.out.println("log y (x) = " + logBase);
		
	}
}
