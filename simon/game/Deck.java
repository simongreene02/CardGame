package simon.game;

import java.util.ArrayList;
import java.util.Random;

import simon.game.Card.Rank;
import simon.game.Card.Suit;

public class Deck {
	private ArrayList<Card> cards;

	public Deck() {
		this.cards = new ArrayList();
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				cards.add(new Card(rank, suit));
			}
		}
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public Card pickCard() {
		return cards.remove(0);
	}
	
	public boolean hasNext() {
		return !cards.isEmpty();
	}

	void shuffle(int seed) {
		ArrayList<Card> tempCards = new ArrayList(cards.size());
		Random randomInt = new Random(seed);
		while (!cards.isEmpty()) {
			int index = randomInt.nextInt(cards.size());
			tempCards.add(cards.remove(index));
		}
		cards = tempCards;
	}
}
