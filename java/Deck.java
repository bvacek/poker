public class Deck {
	private Card[] cards = new Card[52];
	private static String[] suits = {"Hearts", "Diamonds", "Jacks", "Spades"}; 

	public Deck() {
		int k = 0;
		for (int i = 0; i < this.suits.length; i++) {
			for (int j = 1; j < 14; j++){
				this.cards[k] = new Card(j,this.suits[i]);
				k++;
			}
		}
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < this.cards.length; i++) {
			Card temp = this.cards[i];
			result += temp.toString() + "\n"; 	
		}
		return result;
	}
}
