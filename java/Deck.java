import java.util.*;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>();
	private static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"}; 

	public Deck() {
		for (int i = 0; i < this.suits.length; i++) {
			for (int j = 1; j < 14; j++) {
				this.cards.add(new Card(j,this.suits[i]));
			}
		}
	}

	public void shuffle() {
		Collections.shuffle(this.cards);
	}

	public void deal(Player player, int amount) {
		for (int i = 0; i < amount; i++) {
			player.give(this.cards.remove(0));
		}
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < this.cards.size(); i++) {
			Card temp = this.cards.get(i);
			result += temp.toString() + "\n"; 	
		}
		return result;
	}
}
