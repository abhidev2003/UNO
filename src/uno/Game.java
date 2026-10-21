package uno;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	Deck deck = new Deck(); //A deck has 108 cards.
	//The card class contains the characteristics of the Cards.
	
	int numberOfPlayers=playerCheck(); //The number of players allowed for the game. 
	
	
	
	ArrayList<Card> discardPile = new ArrayList<>(); //Discard pile stores the cards that are discarded by the players.
	
	ArrayList<Player> players = new ArrayList<Player>(); //Store the players that are playing the game.
	//Each player has a hand of data type Card.
	
	
	public Game(int numberOfPlayers){
		this.numberOfPlayers=numberOfPlayers;
		for(int i=0;i<numberOfPlayers;i++) {
			Player player = new Player();
			players.add(player);
		}
	}
	//Function to check the Number Of Players Allowed for the Game.
	public static int playerCheck() {
		Scanner sc = new Scanner(System.in);
		int numberOfPlayers;
		System.out.println("Enter the Number Of Players");
		numberOfPlayers= sc.nextInt();

		if(numberOfPlayers<2||numberOfPlayers>10) {
			System.out.println("Must be between 2 and 10 Players");
			return playerCheck();
		}
		return numberOfPlayers;
	}
	
	
	//Function that gives players their first 7 cards from the shuffled Deck.
	void drawIntial7Cards() {
		for(int i=0 ; i<7;i++) {
			for(Player p: players) {
				p.hand.add(deck.drawcard());
			}
		}
	}

}
