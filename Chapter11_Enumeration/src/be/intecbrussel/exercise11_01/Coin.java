package be.intecbrussel.exercise11_01;

public enum Coin {
    ONE_CENT(1, "cent"),
    TWO_CENTS(2, "cents"),
    FIVE_CENTS(5, "cents"),
    TEN_CENTS(10, "cents"),
    TWENTY_CENTS(20, "cents"),
    FIFTY_CENTS(50, "cents"),
    ONE_EURO(1, "euro"),
    TWO_EUROS(2, "euros");

    private int value;
    private String type;

    private Coin(int value, String type){
        this.value = value;
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name() +  "(" + value + " " + type + ") ";
    }
}
