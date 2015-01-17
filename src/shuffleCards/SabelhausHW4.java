package shuffleCards;
//Define Main class
public class SabelhausHW4 {
	//Declare Main Void
    public static void main(String[] args) {
    	//Construct deck 1
    	Deck deck1 = new Deck();	
    	//construct deck 2
    	Deck deck2 = new Deck();
    //output cards from deck 1 and deck 2 with a tab between them
	for(int i = 0; i < 51; i++) {
		Card card1 = deck1.getCard(i);
		
		Card card2 = deck2.getCard(i);
		
		System.out.println(card1 + "\t" + card2);
		}
	
    }

}
