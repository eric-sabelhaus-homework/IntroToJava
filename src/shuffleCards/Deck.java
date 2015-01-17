package shuffleCards;
//import dependencies
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//Define Deck class
public class Deck {
	private Card[] cards;
	//Deck constructor
	public Deck() {
			//Call a new deck of 52 cards
    		cards = new Card[52];
    		int x=0;
    		//parse the index line by line and insert a card
    		for (int b=0; b < 4; b++) {
        		for (int a=0; a < 13; a++) {
        			cards[x] = new Card(a,b);
        			x++;
        		}
		}
    	//output the cards to a list
    	List<Card> cardList = Arrays.asList(cards);
    	//shuffle the list
    	Collections.shuffle(cardList);
    	//Print shuffled list back to an array
    	cardList.toArray(cards);
	}
	//Get a card at the current index
	public Card getCard(int index) {
		return cards[index];
	}	
	//Deal cards of the deck 
	public void deal() {
		//parse the index and print a card until the array is completed
		for (int b=0; b< cards.length; b++) {
        		System.out.println(cards[b]);
		
		}	
	}
}