package pdc_blackjack_part2;


import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean playAgain = false;
        int money = 100;
    
        do {
            Deck deck = new Deck();
            Player player = new Player();
            Dealer dealer = new Dealer();
    
            player.draw(deck);
            player.draw(deck);
            dealer.draw(deck);
    
            boolean gameEnd = false;
    
            int dealerValue = HandValue.calculate(dealer.getHand());
            System.out.println("Dealer's hand: " + dealer.getHand() + " and [One Facedown Card]");
            System.out.println("Dealer's hand value: " + dealerValue);
    
            while (!gameEnd) {
                System.out.println("Player's hand: " + player.getHand());
                int playerValue = HandValue.calculate(player.getHand());
                System.out.println("Player's hand value: " + playerValue);
                if (playerValue == 21) {
                    System.out.println("Winner winner chicken dinner! You got 21!");
                    gameEnd = true;
                    break;
                } else if(playerValue > 21) {
                    System.out.println("Bust!");
                    gameEnd = true;
                    break;
                }
    
                System.out.println("Would you like to 'hit' or 'stand'?");
                String action = scanner.nextLine().toLowerCase();
    
                if (action.equals("hit")) {
                    try {
                        player.draw(deck);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("The deck is empty. Game over.");
                        gameEnd = true;
                    }
                } else if (action.equals("stand")) {
                    dealer.draw(deck);
                    break;
                } else {
                    System.out.println("Invalid action. Please enter 'hit' or 'stand'.");
                }
            }
    
            int playerValue = HandValue.calculate(player.getHand());
    
            while (HandValue.calculate(dealer.getHand()) <= 16) {
                dealer.draw(deck);
                dealerValue = HandValue.calculate(dealer.getHand());
                System.out.println("Dealer's hand: " + dealer.getHand());
                System.out.println("Dealer's hand value: " + dealerValue);
            }
    
            dealerValue = HandValue.calculate(dealer.getHand());
    
            if (playerValue > 21) {
                System.out.println("Dealer wins.");
                money /= 2;
                System.out.println("You now have $" + money);
            } else if (dealerValue > 21) {
                System.out.println("Player wins.");
                money *= 2;
                System.out.println("You now have $" + money);
            } else if (playerValue > dealerValue) {
                System.out.println("Player wins.");
                money *= 2;
                System.out.println("You now have $" + money);
            } else if (dealerValue >= playerValue && dealerValue > 21) {
                System.out.println("Player Loses.");
                money /= 2;
                System.out.println("You now have $" + money);
            } else if(dealerValue > playerValue) {
                System.out.println("Dealer wins.");
                money /= 2;
                System.out.println("You now have $" + money);
            }else {
                System.out.println("It's a tie.");
                System.out.println("You still have $" + money);
            }
    
            System.out.println(playerValue + " Player's hand: " + player.getHand());
            System.out.println(dealerValue + " Dealer's hand: " + dealer.getHand());
    
            
            System.out.println("Do you want to play again? (yes/no)");
            
            while(true){
                String playAgainInput = scanner.nextLine().toLowerCase();
                    if(playAgainInput.trim().equals("yes")){
                        playAgain = true;
                        break;
                    }else if(playAgainInput.trim().equals("no")){
                        playAgain = false;
                        break;
                    }
                    else{
                        System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                    }
                }
    
        } while (playAgain);
    
        System.out.println("Game Ended");
        scanner.close();
    }
}