package simon.game;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {
	private Deck deck;
	@Before
	public void init() {
		deck = new Deck();
	}
	@Test
	public void test() {
		assertEquals(52, deck.getCards().size());
	}

	@Test
	public void pickCard() {

		assertEquals(deck.pickCard(), new Card(Card.Rank.ACE, Card.Suit.SPADES));
		assertEquals(deck.pickCard(), new Card(Card.Rank.ACE, Card.Suit.HEARTS));
		assertEquals(deck.pickCard(), new Card(Card.Rank.ACE, Card.Suit.CLUBS));
		assertEquals(49, deck.getCards().size());
	}
	@Test
	public void shuffle() {
		deck.shuffle(0);
		assertNotEquals(deck.pickCard(), new Card(Card.Rank.ACE, Card.Suit.SPADES));
		assertNotEquals(deck.pickCard(), new Card(Card.Rank.ACE, Card.Suit.HEARTS));
		assertNotEquals(deck.pickCard(), new Card(Card.Rank.ACE, Card.Suit.CLUBS));
	}
}
