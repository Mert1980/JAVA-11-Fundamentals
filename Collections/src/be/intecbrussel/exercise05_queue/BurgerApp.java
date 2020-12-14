package be.intecbrussel.exercise05_queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BurgerApp {
    public static void main(String[] args) {

        Queue<BurgerOrder> orders = new PriorityQueue<>();
        orders.offer(new BurgerOrder("BigMacMenu", 4));
        orders.offer(new BurgerOrder("ChickenMenu", 1));
        orders.offer(new BurgerOrder("VegiMenu", 3));
        orders.offer(new BurgerOrder("KidsMenu", 2));

        BurgerOrder order = orders.peek();

        while(order != null){
            System.out.println("About to prepare " + order);
            order = orders.poll();
            System.out.println("Preparing " + order);
            order = orders.peek();
        }
    }
}
