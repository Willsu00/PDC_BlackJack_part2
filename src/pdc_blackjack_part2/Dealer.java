package com.mycompany.blackjackpdc;

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