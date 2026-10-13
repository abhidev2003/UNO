package uno;

public class Main {
	public static void main(String[] args) {
		Deck deck = new Deck();
		System.out.println(deck.cards.size());
	//  for(type variable : collections)
		for(Card c : deck.cards) {
			System.out.println("Color: "+c.color+
							   " Type :"+c.cardType+
							   " Value "+c.value);
			System.out.println();
		}
		
		
	}
}
