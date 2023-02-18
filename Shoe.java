import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shoe {

    private List<BJCard> nCardList;
    private int count;
    private Deck cardList;

    public Shoe(int count) {
        nCardList = new ArrayList<>();
        this.count = count;
        createShoe();
        shuffle();

    }

    public List<BJCard> getNCardList() {
        return nCardList;
    }

    public void createShoe() {
        this.cardList = new Deck();
        List<BJCard> deckList = cardList.getDeck();
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 13; j++) {
                nCardList.add(deckList.get(j));
            }
        }
    }


    public void shuffle() {
        int cardSize = nCardList.size();
        Random random = new Random();
        for (int i = 0; i < cardSize; i++) {
            int index = random.nextInt(cardSize - i); // ////
            swap(nCardList, i, index);
        }
    }

    public void swap(List<BJCard> list, int left, int right) {
        BJCard tmp = list.get(left);
        list.add(left, list.get(right));
        list.add(right, tmp);
    }

    public BJCard dealCard() {
        if (nCardList.size() == 0) {
            createShoe();
        }
        return nCardList.remove(0);
    }

}
