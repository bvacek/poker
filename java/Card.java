public class Card {
	private String suit = "";
	private int value = 0;
	
	public Card(int value1, String suit1) {
		this.value = value1;
		this.suit = suit1;
	}

	public int getValue() {
		if (this.value > 1 && this.value < 11) {
			return this.value;
		} else if (this.value == 1) {
			return 11;
		} else {
			return 10;
		}
	}

	public String toString() {
		String result = "";
		if (this.value == 1) {
			result += "Ace";
		} else if (this.value < 11) {
			result += Integer.toString(this.value);
		} else if (this.value == 11) {
			result += "Jack";	
		} else if (this.value == 12) {
			result += "Queen";
		} else {
			result += "King";
		}
		result += " of " + this.suit;
		return result;
	}
}
