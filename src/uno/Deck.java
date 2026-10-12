package uno;
import java.util.ArrayList;

public class Deck {
	ArrayList<Card> cards = new ArrayList<Card>();
	Color colors[] = {
			Color.BLUE,
			Color.GREEN,
			Color.RED,
			Color.YELLOW
	};
	
	public Deck() {
		for(int i=0;i<10;i++) {
			
			for(Color color: colors) {
					cards.add(new Card(color,CardType.NUMBER,i));
					
					if(i!=0) {
						cards.add(new Card(color,CardType.NUMBER,i));
					}
				
			}
		}
		for(Color color: colors) {
			cards.add(new Card(color,CardType.DRAW_TWO,-1));
			cards.add(new Card(color,CardType.DRAW_TWO,-1));
			
			cards.add(new Card(color,CardType.REVERSE,-1));
			cards.add(new Card(color,CardType.REVERSE,-1));
			
			cards.add(new Card(color,CardType.SKIP,-1));
			cards.add(new Card(color,CardType.SKIP,-1));


		}

		
	}
	
	
}

