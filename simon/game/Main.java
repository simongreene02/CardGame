package simon.game;

public class Main {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle(413);
		while (deck.hasNext()) {
			System.out.println(deck.pickCard());
		}
		System.out.println("Complete!");

	}

}
