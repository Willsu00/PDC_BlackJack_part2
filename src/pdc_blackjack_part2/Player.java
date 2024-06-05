package pdc_blackjack_part2;


import java.util.ArrayList;
import java.util.List;

public class Player {
    protected List<Card> hand;

    public Player() {
        hand = new ArrayList<>();
    }

    public void draw(Deck deck) {
        hand.add(deck.drawCard());
    }

    public List<Card> getHand() {
        return hand;
    }

}