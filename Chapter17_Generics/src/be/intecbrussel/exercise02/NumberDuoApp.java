package be.intecbrussel.exercise02;

public class NumberDuoApp {
    public static void main(String[] args) {
        NumberDuo<Integer> nd1 = new NumberDuo<>(2, 5);
        NumberDuo<Double> nd2 = new NumberDuo<>(2.5, 5.7);
        NumberDuo<Number> nd3 = new NumberDuo<>(2, 5);

        // using wildcard
        NumberDuo<?> nd4 = new NumberDuo<Integer>(2, 5);
        // Integer i = nd4.getFirst(); --> wrong, minimum required type is Number
        // nd4.setFirst(new Float(6)); --> wrong, minimum required type is Number
        Number i = nd4.getFirst();
        System.out.println(nd1.sum());
        System.out.println(nd2.sum());
        System.out.println(nd3.sum());
        System.out.println(nd4.getFirst());
    }
}
