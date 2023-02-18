public class Card {
    private SUIT suit;
    private int faceValue;

    public Card(SUIT suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public SUIT getType() {
        return suit;
    }
}
