package shuffleCards;
//Define Card Class
public class Card {
		//Create private values so that they cannot be altered
		private int value, suit;
		private static String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		private static String[] suits = {"Hearts", "Diamonds", "spades", "Clubs"};

		//Card constructor
		Card(int value, int suit) {
			this.suit = suit;
			this.value = value;
		}
		//Return the current value
		public int getValues(){
			return value;
		}
		//Return the current suit
		public int getSuits() {
			return suit;
		}
		//Provide a string to be returned by the main
		public @Override String toString() {
			return values[value] + " of " + suits[suit];
		}

}

