package pdc_blackjack_part2;


import java.util.List;

public class HandValue {
    public static int calculate(List<Card> hand) {
        int value = 0;
        int aceCount = 0;
        for (Card card : hand) {
            String rank = card.getRank();
            if (rank.equals("A")) {
                value += 11;
                aceCount++;
            } else if (rank.matches("K|Q|J")) {
                value += 10;
            } else {
                value += Integer.parseInt(rank);
            }

        }

        while (value > 21 && aceCount > 0) {
            value -= 10; // Subtract the 10 we added when we counted the Ace as 11
            aceCount--;
        }

        return value;
    }

    
}