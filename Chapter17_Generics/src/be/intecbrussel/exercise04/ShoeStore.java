package be.intecbrussel.exercise04;

public class ShoeStore {
    public static void main(String[] args) {
        Shoe left = new Shoe(43, "white");
        Shoe right = new Shoe(44, "black");

        ShoePair shoePair = new ShoePair(left, right);

        System.out.println(shoePair);
        shoePair.swap();
        System.out.println(shoePair);
    }
}
