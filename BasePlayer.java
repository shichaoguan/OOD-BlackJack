import java.util.ArrayList;
import java.util.List;

public class BasePlayer {
    private List<Hand> hands;

    public BasePlayer() {
        this.hands = new ArrayList<>();
    }

    public void addHand(Hand hand) {
        hands.add(hand);
    }

    public void removeHand(Hand hand) {
        hands.remove(hand);
    }

    public List<Hand> getHands() {
        return hands;
    }

    public int getTotalScore() {
        ///
        return 0;
    }
}
