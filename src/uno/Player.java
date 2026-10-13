package uno;

import java.util.ArrayList;

public class Player {
	
	
	ArrayList<Card> hand = new ArrayList<Card>();
	
	public Card drawcard() {
		return hand.remove(0);
	}
	
}
