package simon.game;

public class Card {
	private Rank rank;
	private Suit suit;
	enum Suit {SPADES, HEARTS, CLUBS, DIAMONDS};
	enum Rank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
	
	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	@Override
	public String toString() {
		return rank + " of " + suit;
	}
	
	@Override
	public boolean equals(Object object){
		if (object instanceof Card){
			Card thatCard = (Card)object;
			return this.rank == thatCard.rank && this.suit == thatCard.suit;
		}
		return false;
	}
}
