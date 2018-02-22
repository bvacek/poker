import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class Player {
	private Card[] hand;
	private int[] values;

	public Player() {
		this.hand = new Card[0];
		this.values = new int[0];
	}

	public void give(Card input) {
		Card[] temp = new Card[this.hand.length + 1];
		int[] tempInt = new int[this.values.length + 1];
		for (int i = 0; i < this.hand.length; i++) {
			temp[i] = this.hand[i];
			tempInt[i] = this.values[i];
		}
		temp[this.hand.length] = input;
		this.hand = temp;
		tempInt[this.values.length] = input.getValue();
		this.values = tempInt;
	}
	
	public int getValue(){
		ArrayList temp = new ArrayList();
		for (int i = 0; i < this.values.length; i++){
			temp.add(this.values[i]);
		}
		int result = 0;
		for (int i = 0; i < temp.size(); i++) {
			result += (int)temp.get(i);
		}
		while (result > 21 && temp.contains(11)) {
			temp.set(temp.indexOf(11), 1);
			result -= 10;
		}
		return result;
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < this.hand.length; i++) {
			result += hand[i].toString() + " ";
		}
		return result;
	}
}
