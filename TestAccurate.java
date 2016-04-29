
//U10111003 朱永捷

import java.util.Scanner;

public class TestAccurate {
	public static void main(String[] args){

		// Prompt the user to enter value 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Compute : x □ y =");
		System.out.print("x = ");
		double x = scanner.nextDouble();
		System.out.print("y = ");
		double y = scanner.nextDouble();

		// Create Accurate class
		Accurate compute = new Accurate(x,y);
		
		// Show results
		System.out.println("x + y =" + compute.add());
		System.out.println("x - y =" + compute.sub());
		System.out.println("x * y =" + compute.multi());
		if ( y == 0) {
			System.out.println("y can't be 0");
		} else {
			System.out.println("x / y =" + compute.subtrac());
		}
	}
}
