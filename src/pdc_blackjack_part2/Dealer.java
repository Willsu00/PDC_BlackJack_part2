package pdc_blackjack_part2;


public class Dealer extends Player {
    @Override
    public void draw(Deck deck) {

        if(HandValue.calculate(hand) <= 16) {
            super.draw(deck);   
            System.out.println(getHand());

        }
        else if(HandValue.calculate(hand) >= 17) {
            System.out.println("Dealer stands.");
        }
    }
}