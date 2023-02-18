import java.util.ArrayList;
import java.util.List;

public class Player extends BasePlayer{
    private double total = 100;




    public void getBet(double amount) {
        total += amount;
    }

    public void loseBet(double amount) {
        total -= amount;
    }
}
