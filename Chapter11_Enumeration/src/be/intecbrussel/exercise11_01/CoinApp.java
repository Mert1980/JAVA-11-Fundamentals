package be.intecbrussel.exercise11_01;

public class CoinApp {

    public static void main(String[] args) {
        Coin[] coins = new Coin[8];

        for (int i = 0; i < Coin.values().length ; i++) {
            int j = RandomGenerator.getNextInt(0, 8);
            coins[i] = Coin.values()[j];
        }
        calculateTotal(coins);
    }

    public static void calculateTotal(Coin[] coins){
        int totalCents = 0;
        int totalEuros = 0;

        for (Coin c:coins
        ) {
            if(c.getType().contains("cent") || c.getType().contains("cents")){
                totalCents+=c.getValue();
                if(totalCents >= 100){
                    totalEuros+=1;
                    totalCents = totalCents - 100;
                }
            }
            if(c.getType().contains("euro") || c.getType().contains("euros")){
                totalEuros+=c.getValue();
            }
        }
        printTotal(totalEuros, totalCents);
    }

    private static void printTotal(int euros, int cents){
        System.out.println("Total value: " + euros + " euros" + " " + cents + " cents");
    }
}
