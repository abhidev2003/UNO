package uno;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Card> cards = new ArrayList<Card>(); //ArrayList to Store the 108 cards.
	Color colors[] = { //List of available colors. Made for looping things easier
			Color.BLUE,
			Color.GREEN,
			Color.RED,
			Color.YELLOW
	};
	//Constructor to initialize the 108 cards.
	
	public Deck() {
		
		//Every Color card is initialized to the ArrayList cards.
		for(int i=0;i<10;i++) {
			
			for(Color color: colors) {
					cards.add(new Card(color,CardType.NUMBER,i));
					
					if(i!=0) {
						cards.add(new Card(color,CardType.NUMBER,i));
					}
				
			}
		}
		//Every color power cards is initialized
		for(Color color: colors) {
			cards.add(new Card(color,CardType.DRAW_TWO,-1)); 
			cards.add(new Card(color,CardType.DRAW_TWO,-1));
			
			cards.add(new Card(color,CardType.REVERSE,-1));
			cards.add(new Card(color,CardType.REVERSE,-1));
			
			cards.add(new Card(color,CardType.SKIP,-1));
			cards.add(new Card(color,CardType.SKIP,-1));

		}
		//Every wild Card is initialized 
		for(int i=0 ; i<4;i++) {
			cards.add(new Card(Color.WILD, CardType.WILD_DRAW_FOUR,-1));
			cards.add(new Card(Color.WILD, CardType.WILD,-1));

			
		}
		Collections.shuffle(cards); //Shuffles the Card
		
		
	}
	
	//Function to remove and return the card at index 1.
	public Card drawcard() {
		return cards.remove(0); //Remove the card at the first index and returns it
	}
	
	
}

