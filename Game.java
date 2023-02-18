import java.util.List;
import java.util.Scanner;

public class Game {
    private Player player;
    private Dealer dealer;
    private Shoe shoe;
    private final int maxCount = 3;
    private double bet;

    public Game (Player player, Dealer dealer) {
        this.player = player;
        this.dealer = dealer;
        this.shoe = new Shoe(maxCount);

    }

    /* starting game:
        - give two hand to player and dealer;
        while loop :
            ask action from user;
            if (action is 21) ; break loop

     */
    public void start() {
        this.bet = getBetfromUI(this.player);
        Hand playerHand = new Hand(shoe.dealCard(), shoe.dealCard());
        Hand dealHand = new Hand(shoe.dealCard(), shoe.dealCard());

        while (true) {
            for (Hand hand: this.player.getHands()) {
                String action = askAction();
                playAction(action, hand);
                if (action.equals("stand") ) {
                    break;
                }
            }
        }

    }

    // actons:
    public void playAction(String action, Hand hand) {
        switch(action) {
            case "hit": hit(hand);
                break;
            case "split": split(hand);
                break;
            case "stay":
                break;
            case "stand": stand();
                break;
            default:
                System.out.println("Wrong input");

        }
    }

    private void hit(Hand hand) {
        List<BJCard> cards = hand.getHands();
        cards.add(this.shoe.dealCard());
    }

    private void split(Hand hand) { // split which hand
        List<BJCard> cards = hand.getHands();
        player.addHand(new Hand(cards.get(0), shoe.dealCard()));
        player.addHand(new Hand(cards.get(1), shoe.dealCard()));
        player.removeHand(hand);
    }

    private void stand() {
        int playerScore = player.getTotalScore();
        int dealerScore = dealer.getTotalScore();

        for (Hand hand : player.getHands()) {
            int bestScore = hand.getBestScore();
            if (bestScore == 21) {
                player.getBet(this.bet * 1.5);
            } else if (bestScore > dealerScore) {
                player.getBet(this.bet * 2);
            } else if (bestScore < dealerScore) {
                player.loseBet(this.bet);
            } else { // tie
                System.out.println("it is tied");
            }

        }
    }
    // input bet
    public int getBetfromUI(Player player) {
        Scanner console = new Scanner(System.in);
        int input = console.nextInt();
        return input;
    }

    // input action:
    public String askAction() {
        Scanner console = new Scanner(System.in);
        String input = console.next();
        return input;
    }

}
