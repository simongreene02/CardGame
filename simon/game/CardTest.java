package simon.game;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {

	@Test
	public void constructor() {
		Card card = new Card(Card.Rank.JACK, Card.Suit.SPADES);
		assertEquals("JACK of SPADES", card.toString());
	}
	@Test
	public void equals_validCards_true() {
		Card card1 = new Card(Card.Rank.JACK, Card.Suit.SPADES);
		Card card2 = new Card(Card.Rank.JACK, Card.Suit.SPADES);
		assertTrue(card1.equals(card2));
	}
	@Test
	public void equals_differentCards_false() {
		Card card1 = new Card(Card.Rank.KING, Card.Suit.DIAMONDS);
		Card card2 = new Card(Card.Rank.JACK, Card.Suit.SPADES);
		assertFalse(card1.equals(card2));
	}
	@Test
	public void equals_nullCard_false() {
		Card card1 = new Card(Card.Rank.KING, Card.Suit.DIAMONDS);
		assertFalse(card1.equals(null));
	}
	@Test
	public void equals_stringCard_false() {
		Card card1 = new Card(Card.Rank.KING, Card.Suit.DIAMONDS);
		assertFalse(card1.equals("KING of DIAMONDS"));
	}

}
