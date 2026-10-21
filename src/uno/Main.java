package uno;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Deck deck = new Deck();
		System.out.println(deck.cards.size());
	//  for(type variable : collections)
//		for(Card c : deck.cards) {
//			System.out.println("Color: "+c.color+
//							   " Type :"+c.cardType+
//							   " Value "+c.value);
//			System.out.println();
//		}
		
		int numberOfPlayers= playerCheck();
		
		Game g = new Game(numberOfPlayers);
		
		
		g.drawIntial7Cards();
		for(int i=0;i<g.numberOfPlayers;i++) {
			for(Card c : g.players.get(i).hand) {
				System.out.println("Color: "+c.color+
								   " Type :"+c.cardType+
								   " Value "+c.value);
			}
			System.out.println("_____________________");

		}
	}

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
}
	
