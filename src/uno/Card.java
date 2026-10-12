package uno;

public class Card {
	Color color;
	CardType cardType;
	int value ;
	
	Card(Color color, CardType cardType, int value){
		if (value<0 || value>9 ) {
			throw new IllegalArgumentException("Value must be from 0 and 9");
		}
		this.cardType=cardType;
		this.color=color;
		this.value=value;
	}
}
