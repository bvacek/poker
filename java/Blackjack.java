import java.util.*;

public class Blackjack {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useDelimiter("\\s");
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
			System.out.println("Here are your cards: " + player.toString());
			System.out.println("They add to " + player.getValue());
			System.out.println();
			boolean hitting = true;
			while (hitting) {
				System.out.println("Hit or stay?");
				String answer = input.next();
				System.out.println();
				answer = answer.toLowerCase();
				if (answer.equals("hit")) {
					deck.deal(player, 1);
					System.out.println("Here are your cards: " + player.toString());
					System.out.println("They add to " + player.getValue());
					System.out.println();
					if (player.getValue() > 21) {
						hitting = false;
						System.out.println("Bust! You lost. :(");
					}
				} else {
					hitting = false;
				}
			}
			while (dealer.getValue() <= 17 && player.getValue() <= 21) {
				deck.deal(dealer, 1);
				System.out.println("Here are the dealer's cards: " + dealer.toString());
				System.out.println("They add to: " + dealer.getValue());
				System.out.println();
			}
			if (dealer.getValue() > 21) {
				System.out.println("The dealer busts! You win! :)");
				System.out.println();
			} else if (dealer.getValue() < player.getValue() && player.getValue() <= 21) {
				System.out.println("You win! :)");
				System.out.println();
			} else if (dealer.getValue() == player.getValue()) {
				System.out.println("You tied with the dealer. :|");
				System.out.println();
			} else {
				System.out.println("You lost. :(");
				System.out.println();
			}
			System.out.println("Would you like to play again? (yes or no)");
			String answer = input.next();
			answer = answer.toLowerCase();
			if (!answer.equals("yes")) {
				playing = false;
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}
}
