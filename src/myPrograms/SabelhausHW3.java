/**
 * 
 */
package myPrograms;

/**
 * @author Epic
 *
 */

//import dependencies
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

//Declare class
class SabelhausHW3 {
	//Generate Array
	public static int[] generateNewArray(int length) {
		//Generate random number
		int[] genArray = new int[length];
		for(int i = 0; i < length; i++) {
			Random num = new Random();
			
			genArray[i] = num.nextInt(99) + 1;
		}
		//output array
		return genArray;
	}
	//Generate sorted array of numbers divisible by int divisible
	public static int[] divisibleByArray(int[] genArray, int divisible) {
		int count = 0;
		//count numbers that are divisible
		for(int i = 0; i < genArray.length; i++) {
			if (genArray[i]%divisible == 0)
				++count;
		}
		//initiate new array
		int[] subset = new int[count];
		int subsetIndex = 0;
		//index values into new array
		for(int j = 0; j < genArray.length; j++) {
			if (genArray[j]%divisible == 0){
				subset[subsetIndex] = genArray[j];
				++subsetIndex;
				
			}
		}
		//sort array
		Arrays.sort (subset);
		//output array
		return subset;
	}
	//Create output based upon input array and name
	public static void printer(int[] data, String name) {
		name = name + "Array";
		
		System.out.print(name + "{");
		
		for (int i = 0; i < data.length - 1; i++) {
			System.out.print (data[i] + ", ");
		}
		System.out.println(data[data.length - 1] + "}");
	}
	//main method
	public static void main(String[] args) {
		//Eclipse would not stop griping about this, so I finally broke and put it in
		@SuppressWarnings("resource")
		//scan for input
		Scanner input = new Scanner(System.in);
		//Accept integers for array creation
		System.out.println("Enter Amount of Random Numbers");
		final int length = input.nextInt();
	    //Accept integers for division
		System.out.println("Enter Divisor");
		int divisible = input.nextInt();
		//utilize array generating method for random numbers then print it
		int[] genArray = generateNewArray(length); {
			printer(genArray, "Generated ");
		}
		//utilize array generating method for sorted random numbers from main array then print it
		int[] subset = divisibleByArray(genArray, divisible); {
			printer(subset, "Divisible ");
		}
		//exit the program
		System.exit( 0 );
		
		}

}
