import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<BJCard> hands;
    private int totalScore;

    public Hand(BJCard card1, BJCard card2) {
        hands = new ArrayList<>();
        hands.add(card1);
        hands.add(card2);
    }

    public List<BJCard> getHands() {
        return hands;
    }

    public void addCard(BJCard card) {
        hands.add(card);
    }

    public int getBestScore() {
        int score = 0;
       return score;
    }



}

