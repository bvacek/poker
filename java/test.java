import java.util.*;

public class test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean playing = true;
		while (playing) {
			Player dealer = new Player();
			Player player = new Player();
			Deck deck = new Deck();
			deck.shuffle();
			deck.deal(dealer, 2);
			deck.deal(player, 2);
			System.out.println("Here are the dealers cards: " + dealer.toString());
			System.out.println("They add to " + dealer.getValue());
			System.out.println();
			boolean hitting = true;
			while (hitting) {
				System.out.println("Here are your cards: " + player.toString());
				System.out.println("They add to " + player.getValue());
				System.out.println();
				System.out.println("Would you like to hit? (yes or no)");
				String answer = input.next();
				System.out.println(answer);
				if (answer.toLowerCase() == "yes") {
					deck.deal(player, 1);
					if (player.getValue() > 21) {
						hitting = false;
						System.out.println("Bust! You lost. :(");
					}
				} else {
					hitting = false;
				}
			}
			playing = false;
		}
	}
}
