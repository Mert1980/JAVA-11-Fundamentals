package be.intecbrussel.exercise11_maps;

public enum Coin {
    ONE_CENT(0.01),
    TWO_CENTS(0.02),
    FIVE_CENTS(0.05),
    TEN_CENTS(0.10),
    TWENTY_CENTS(0.20),
    FIFTY_CENTS(0.50),
    ONE_EURO(1),
    TWO_EUROS(2);

    private double value;

    private Coin(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name();
    }
}
