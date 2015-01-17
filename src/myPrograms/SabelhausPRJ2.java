package myPrograms;

public class SabelhausPRJ2 {
		//Declare dice roll method
		public static int roll() {
			//roll 6 sided dice
			int roll = ((int) (Math.random() * 10)) % 6 + 1;
			//generate returned value
			return roll;	
			}
		//Declare boolean value of true/false
		public static boolean isHold(int turnTotal) {
			boolean bool;
			
			//If statement to check for the turnTotal value and create the boolean statement of true or false
			if (turnTotal >= 20){
				bool = true;
			} else if (turnTotal == 0){
				bool = true;
			} else {
				bool = false;
			}
			
			return bool;
		}
		//declare method to generate each roll of the turn played
		public static int playTurn() {
			//Declare integer to be used for output collection of each roll
			int turnTotal = 0;
			//Do while loop to generate rolling values
			do {
				int roll = roll();
				
				//If statement to print each roll or exit when a 1 is rolled
				if (roll == 1) {
					System.out.println("Roll:" + roll);
					
					System.out.println("Turn total: 0");
					
					turnTotal = 0;
				} else {
				    System.out.println("Roll:" + roll);
					
					turnTotal += roll;
				}
			//Using boolean method as an output control	again, didnt really understand that well
			} while (isHold(turnTotal));
			
			return playTurn();
		}
		//Declare Main method to calculate total turn value
		public static void main(String[] args) {
			//Declare integers used in main
			int gameTotal = 0, turnPerGame = 0;
			//Create the output
			do {
				int playTurn = playTurn();
				
				if (playTurn >= 20) {
					System.out.println("Turn Total: 20");

					playTurn = 20;
				}

				gameTotal += playTurn;
				
				turnPerGame++;
			} while (turnPerGame <= 10);
			
			System.out.println("Game Total: " + gameTotal);
			
			//Exit Program
			System.exit( 0 );
		}

	}
