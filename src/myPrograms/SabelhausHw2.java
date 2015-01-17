/**
 * 
 */
package myPrograms;

/**
 * @author Epic
 *
 */
//Import dependencies
import java.util.Scanner;

public class SabelhausHw2 {
	//Declare Main
	public static void main(String[] args) {
		//Create input scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		//Declare Integers to be used in the program
		int count = 0, num, sum = 0;
		//Output line for input to be expected
		System.out.println("Enter amount of random numbers to be generated: ");
		//Read user input
		int Loop = input.nextInt();
		//Do While Loop
		do {
			//Generate random number using math function
			num = (int)((Math.random()*100)+1);
			//Add 1 to counting mechanism for each loop
			count++;
			//Output for each random number generated
			System.out.println("Random Number " + count + ": " + num);
			//Compute Sum of all random numbers
			sum += num;
			//Trailing While statement with conditions
			} while (count != Loop);
		//Final output	
		System.out.println("Final Number: " + sum);
		//Exit the program
		System.exit( 0 );
	}

}