public class BJCard extends Card {
    private int gameValue;

    public BJCard(SUIT suit, int faceValue) {
        super(suit, faceValue);
        if (faceValue > 10) {
            this.gameValue = 10;
        } else {
            this.gameValue = faceValue;
        }
    }

    public int getGameValue() {
        return gameValue;
    }
}
