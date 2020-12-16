package be.intecbrussel.exercise06_deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Train {
    public static void main(String[] args) {
        Deque<String> train = new ArrayDeque<>();
        train.offerFirst("Locomotive1");
        train.offerLast("wagon1");
        train.offerLast("wagon2");
        train.offerLast("wagon3");
        train.offerLast("wagon4");
        train.offerLast("wagon5");
        train.offerFirst("Locomotive2");
        train.offerLast("wagon6");
        train.offerLast("wagon7");
        train.offerLast("wagon8");
        train.offerLast("wagon9");
        train.offerLast("wagon10");

        String unit = train.pollFirst();
        while(unit != null){
            System.out.println(unit);
            unit = train.pollFirst();
        }
    }

}
