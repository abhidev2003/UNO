package uno;

import java.util.ArrayList;

public class Game {
	Deck deck = new Deck();
	
	int numberOfPlayers;
	ArrayList<Player> players = new ArrayList<Player>();
	
	public Game(int numberOfPlayers){
		this.numberOfPlayers=numberOfPlayers;
		for(int i=0;i>numberOfPlayers;i++) {
			Player player = new Player();
			players.add(player);
		}
	}
	
	
	
	void drawIntial7Cards() {
		for(int i=0 ; i<7;i++) {
			for(Player p: players) {
				p.hand.add(deck.drawcard());
			}
		}
	}
	
	
	
}
