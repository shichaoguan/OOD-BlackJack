import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<BJCard> cardList;

    public Deck() {
        cardList = new ArrayList<>();
        for (SUIT suit : SUIT.values()) {
            for (int i = 0; i <= 13; i++) {
                cardList.add(new BJCard(suit, 13));
            }
        }
    }

    public List<BJCard> getDeck() {
        return cardList;
    }
}
