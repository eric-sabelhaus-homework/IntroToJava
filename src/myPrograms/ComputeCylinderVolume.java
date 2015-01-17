/**
 * 
 */
package myPrograms;

/**
 * @author Eric
 *
 */
//import required dependencies
import javax.swing.JOptionPane;

public class ComputeCylinderVolume {
	//Declare Main
	public static void main (String[] args) { 
		//Declare variables as string
		String firstNumber, secondNumber;
		//Declare variables as double
		double radius, height, volume;
		//Input radius
		firstNumber = JOptionPane.showInputDialog ("Input Radius");
		//Input height
		secondNumber = JOptionPane.showInputDialog ("Input Height");
		//Parse radius and height
		radius = Double.parseDouble (firstNumber);
		height = Double.parseDouble (secondNumber);
		//Do equation to get solution
		volume = 3.14 * radius * radius * height;
		//Create proper output for solution
		String output = "A cylinder with the radius " + radius + ", and a height of " + height + ", has a volume of " + volume;
		//Display output of solution
		JOptionPane.showMessageDialog ( null, output);
		//Exit
		System.exit ( 0 );
	}
}