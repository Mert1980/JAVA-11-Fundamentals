package be.intecbrussel.exercise11_01;

public class CoinApp {
    public static void main(String[] args) {
        Coin[] coins = new Coin[8];

        for (int i = 0; i < Coin.values().length ; i++) {
            coins[i] = Coin.values()[i];
        }

        double total = 0;
        for (Coin c:coins
             ) {
            total+=c.getValue();
        }
        System.out.println("Total value: " + total);


    }
}
