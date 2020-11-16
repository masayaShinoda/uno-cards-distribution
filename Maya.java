import java.util.Arrays;
import java.util.Random;

public class Maya {
	public static void main(String[] args) {
		// the allCards array will be our deck
		String[] allCards = {};
		String[] colors = { "Red", "Yellow", "Green", "Blue" };

		// There are four colors for regular, non-wild cards
		// since there is only one 0 card for each color
		for (int x = 0; x < 4; x++) {
			allCards = Arrays.copyOf(allCards, allCards.length + 1);
			allCards[allCards.length - 1] = colors[x] + " " + 0; // Assign new values to the last element
		}
		for (int j = 0; j < 4; j++) { // Loop through each color
			// Uno cards are numbered 0 to 9

			for (int i = 1; i < 10; i++) { // Give ranks from 1 to 9 for each card colors
				allCards = Arrays.copyOf(allCards, allCards.length + 1);
				allCards[allCards.length - 1] = colors[j] + " " + i; // Assign new values to the last element
				// do it twice since there are pairs of Green 1s, Red 5s... etc...
				allCards = Arrays.copyOf(allCards, allCards.length + 1);
				allCards[allCards.length - 1] = colors[j] + " " + i; // Assign new values to the last element
			}
			for (int i = 0; i < 3; i++) { // For Cancel, Reverse and +2 cards
				if (i == 0) { // Assign Cancel cards
					allCards = Arrays.copyOf(allCards, allCards.length + 1);
					allCards[allCards.length - 1] = colors[j] + " Cancel";
					allCards = Arrays.copyOf(allCards, allCards.length + 1);
					allCards[allCards.length - 1] = colors[j] + " Cancel";

				} else if (i == 1) { // Assign Reverse no u cards
					allCards = Arrays.copyOf(allCards, allCards.length + 1);
					allCards[allCards.length - 1] = colors[j] + " Reverse";
					allCards = Arrays.copyOf(allCards, allCards.length + 1);
					allCards[allCards.length - 1] = colors[j] + " Reverse";

				} else if (i == 2) { // Assign +2 cards
					allCards = Arrays.copyOf(allCards, allCards.length + 1);
					allCards[allCards.length - 1] = colors[j] + " +2";
					allCards = Arrays.copyOf(allCards, allCards.length + 1);
					allCards[allCards.length - 1] = colors[j] + " +2";

				}
			}

			// there are four wild cards and four wild +4 cards, therefore it is possible to
			// use the same for loop
			// HANDLES WILD CARDS
			allCards = Arrays.copyOf(allCards, allCards.length + 1);
			allCards[allCards.length - 1] = "Wild";
			allCards = Arrays.copyOf(allCards, allCards.length + 1);
			allCards[allCards.length - 1] = "Wild +4";

		}

		System.out.println("There are " + allCards.length + " cards in the deck.");

		// Deal cards to player
		String[] player1_cards = {};
		String[] player2_cards = {};
		String[] player3_cards = {};

		for (int i = 0; i < 7; i++) { // Deal 7 random cards to player 1
			Random r = new Random();
			int randomNumber = r.nextInt(allCards.length);
			player1_cards = Arrays.copyOf(player1_cards, player1_cards.length + 1);
			player1_cards[player1_cards.length - 1] = allCards[randomNumber];
		}
		for (int i = 0; i < 7; i++) { // Deal 7 random cards to player 2
			Random r = new Random();
			int randomNumber = r.nextInt(allCards.length);
			player2_cards = Arrays.copyOf(player2_cards, player2_cards.length + 1);
			player2_cards[player2_cards.length - 1] = allCards[randomNumber];
		}
		for (int i = 0; i < 7; i++) { // Deal 7 random cards to player 3
			Random r = new Random();
			int randomNumber = r.nextInt(allCards.length);
			player3_cards = Arrays.copyOf(player3_cards, player3_cards.length + 1);
			player3_cards[player3_cards.length - 1] = allCards[randomNumber];
		}

		// Displays each player's cards
		System.out.println("Player 1 has been dealt: " + Arrays.toString(player1_cards));
		System.out.println("Player 2 has been dealt: " + Arrays.toString(player2_cards));
		System.out.println("Player 3 has been dealt: " + Arrays.toString(player3_cards));

	}

}
