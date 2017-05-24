import java.util.Random;

/**
 * Created by nicholson on 5/24/2017.
 */
public class Coin {

    // fields
    private String sideUp;
    private static Random rand = new Random();

    // Constructor
    public Coin() {
        toss();
    }

    public void toss() {
        sideUp = rand.nextInt(2) == 0 ? "heads" : "tails";
    }

    public String getSideUp() {
        return sideUp;
    }
}
