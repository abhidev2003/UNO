package uno;

import java.util.ArrayList;

public class Game {
	Deck deck = new Deck();
	
	
	ArrayList<Player> players = new ArrayList<Player>();
	
	
	void drawIntial7Cards() {
		for(Player p: players) {
			p.hand.add(deck.drawcard());
		}
	}
	
	
	
}
