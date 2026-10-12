package uno;

public class Card {
	Color color;
	CardType cardType;
	int value;
	
	Card(Color color, CardType cardType, int value){
		this.cardType=cardType;
		this.color=color;
		this.value=value;
	}
}
