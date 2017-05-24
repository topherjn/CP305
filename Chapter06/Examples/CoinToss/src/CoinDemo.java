/**
 * Created by nicholson on 5/24/2017.
 */
public class CoinDemo {

    public static void main(String[] args) {

        Coin coin = new Coin();

        System.out.println(coin.getSideUp());

        for(int i = 0; i < 20; i++) {
            coin.toss();
            System.out.println(coin.getSideUp());
        }
    }
}
