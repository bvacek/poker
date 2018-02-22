public class test {
	public static void main(String[] args) {
		Player player = new Player();
		Card card1 = new Card(1, "Hearts");
		Card card2 = new Card(1, "Spades");
		Card card3 = new Card(1, "Clubs");
		System.out.println(card1.toString() + card2.toString() 
				+ card3.toString());
		player.give(card1);
		int value = player.getValue();
		System.out.println(value);
		player.give(card2);
		value = player.getValue();
		System.out.println(value);
		player.give(card3);
		value = player.getValue();
		System.out.println(value);
	}
}
