
//OK. O.Aktunc
//Javier Reyna EG1305A 05/05/2015

import java.util.Scanner;

public class MilesPerGallon {

	public static void main(String[] args) {
		
		//algorithm used for input of miles
		
		double MPG;
		double miles;
		double gallons;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the miles driven: ");
		
		miles = keyboard.nextDouble();
		
		//algorithm for gallons
		
		System.out.print("Please enter the gallons of fuel used: ");
		
		gallons = keyboard.nextDouble();
		
		//calculate
		
		MPG = miles/gallons;
		
		
		System.out.print("The miles per gallon is: " +MPG);
		
		System.exit(0);
	}
}
