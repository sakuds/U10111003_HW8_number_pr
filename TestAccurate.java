
//U10111003 朱永捷

import java.util.Scanner;

public class TestAccurate {
	public static void main(String[] args){

		// Prompt the user to enter value 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Compute : x □ y =");
		System.out.print("x = ");
		String x = scanner.nextLine();
		System.out.print("y = ");
		String y = scanner.nextLine();

		// Create Accurate class
		Accurate compute = new Accurate(x,y);
		
		// Show results
		System.out.println("x + y =" + compute.add());
		System.out.println("x - y =" + compute.sub());
		System.out.println("x * y =" + compute.multi());
		System.out.println("x / y =" + compute.subtracInt());
	}
}
