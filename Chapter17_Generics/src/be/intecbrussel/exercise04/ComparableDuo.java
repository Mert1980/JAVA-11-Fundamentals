package be.intecbrussel.exercise04;

public class ComparableDuo<T extends Comparable<T>> extends Duo<T> {
    T first;
    T second;

    public ComparableDuo(T first, T second) {
        super(first, second);
    }

    public T getHighest(){
        return getFirst().compareTo(getSecond()) < 0 ? getSecond() : getFirst();
    }

    public T getLowest(){
        return getFirst().compareTo(getSecond()) < 0 ? getFirst() : getSecond();
    }

    /*public int getSum(){
        return getFirst().intValue() + getSecond().intValue();
    }*/
}
