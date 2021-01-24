package be.intecbrussel.exercise07_08_object_locking;

public class Counter {
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public synchronized void decrement(){
        count--;
    }

    public int getCount() {
        return count;
    }
}
