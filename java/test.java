public class test {
	public static void main(String[] args) {
		Player player = new Player();
		Deck deck = new Deck();
		deck.shuffle();
		deck.deal(player, 3);
		System.out.println(player);
	}
}
