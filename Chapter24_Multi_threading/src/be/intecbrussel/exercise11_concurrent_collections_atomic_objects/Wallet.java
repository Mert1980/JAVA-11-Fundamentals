package be.intecbrussel.exercise11_concurrent_collections_atomic_objects;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Wallet {
    public static void main(String[] args) {
        ConcurrentHashMap<Coin, Integer> wallet = new ConcurrentHashMap<>();
        Thread thread1 = new Thread(()->sum(wallet));

        wallet.put(Coin.ONE_CENT, 2);
        wallet.put(Coin.TWO_CENT, 3);
        wallet.put(Coin.FIVE_CENT, 8);
        wallet.put(Coin.TEN_CENT, 1);
        wallet.put(Coin.TWENTY_CENT, 0);
        wallet.put(Coin.FIFTY_CENT, 9);
        wallet.put(Coin.ONE_EURO, 7);
        wallet.put(Coin.TWO_EURO, 1);

        thread1.start();
    }

    private static synchronized void sum(Map<Coin, Integer> wallet) {
        AtomicInteger sum = new AtomicInteger(0);
        for(Coin c:wallet.keySet()){
            System.out.println(c.name() + " : " + wallet.get(c));
            sum.addAndGet(c.getValue() * wallet.get(c));
        }
        System.out.println((sum.get()/100F) + "€"); // 14.08€
    }
}

enum Coin{
    ONE_CENT(1),
    TWO_CENT(2),
    FIVE_CENT(5),
    TEN_CENT(10),
    TWENTY_CENT(20),
    FIFTY_CENT(50),
    ONE_EURO(100),
    TWO_EURO(200);

    private int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
