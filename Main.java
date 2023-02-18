public class Main {
/*
Player, dealer, game;
process:
player put how much bet he wants;
game gave a hand(2 cards) from shore to player;
game gave a hand(2 cards) from shore to dealer;

game asks player action while(true):
    - stay: do nothing;
    - hit, add one card;
    - split,
    - stand, done with game, check who wins;
        get score for dealer
        get best score for player：

        - player score == 21, player get 1.5 * its bet
        - player  score > dealer score: player bet * 2;
        - player score < dealer score; give bet to dealer;
        - tie: nothing lost
       break

Object: basicPlayer(palyer, dealer); game/run rules; card: 1 card -> 1 BJcard || Hand：2 cards -> deck: 52 BJcard -> shore: N * 52 BJcard
 */

    public static void main(String[] args) {

        Player player = new Player();
        Dealer dealer = new Dealer();
        Game game = new Game(player, dealer);

        game.start();
    }
}
