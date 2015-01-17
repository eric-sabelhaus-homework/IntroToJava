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

public class SabelhausPrj1 {
	//Declare Main
	public static void main (String[] args) {
		//Setting String variables to be used throughout the program
		String firstName, middleInitial, lastName, age, luckyNumber1, luckyNumber2, luckyNumber3, name, user = null, finalLuckyNumber;
		//Setting numeric values to be used throughout the file
		double _age, _luckyNumber1, _luckyNumber2, _luckyNumber3, luckyNumber;
		//Input first name
		firstName = JOptionPane.showInputDialog("Input Your First Name");
		//Input middle initial
		middleInitial = JOptionPane.showInputDialog("Input Your Middle Initial");
		//Input last name
		lastName = JOptionPane.showInputDialog("Input Your Last Name");
		//Input age
		age = JOptionPane.showInputDialog("Input Age as Number");
		//Input Lucky Number1
		luckyNumber1 = JOptionPane.showInputDialog("Input Lucky Number 1");
		//Input Lucky Number2
		luckyNumber2 = JOptionPane.showInputDialog("Input Lucky Number 2");
		//Input Lucky Number3
		luckyNumber3 = JOptionPane.showInputDialog("Input Lucky Number 3");
		//Parse string for age as double
		_age = Double.parseDouble (age);
		//Parse string for LN1 as double
		_luckyNumber1 = Double.parseDouble (luckyNumber1);
		//Parse string for LN2 as double
		_luckyNumber2 = Double.parseDouble (luckyNumber2);
		//Parse string for LN3 as double
		_luckyNumber3 = Double.parseDouble (luckyNumber3);
		//Create name output string
		name = "* Welcome "+ firstName +" "+ middleInitial +". "+ lastName + "\n";
		//Math function to calculate average lucky number
		luckyNumber = (_luckyNumber1 + _luckyNumber2 + _luckyNumber3) /3;
		//Create lucky number output string
		finalLuckyNumber = "* The average of your lucky number is: " + luckyNumber;
		//create output string for a kid
		if(_age <= 12){
			user = "* You're just a Kid!\n";
		}
		//create output string for a teen
		if((_age > 12) && (_age < 20)){
			user = "* Welcome Teenager!\n";
		}
		//create output string for a young adult
		if(_age == 20){
			user = "* Welcome Young Adult!\n";
		}
		//create output string for an adult
		if(_age > 20){
			user = "* Welcome Adult!\n";
		}
		//Display full output
		JOptionPane.showMessageDialog ( null, name + user + finalLuckyNumber);
		//Exit the program
		System.exit( 0 );
	}
}
