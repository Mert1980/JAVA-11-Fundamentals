package be.intecbrussel.exercise04;

public class GeneralPair<E> implements Pair<E>{
    private E leftShoe;
    private E rightShoe;

    public GeneralPair(E left, E right) {
        this.leftShoe = left;
        this.rightShoe = right;
    }

    @Override
    public E getLeft() {
        return leftShoe;
    }

    @Override
    public E getRight() {
        return rightShoe;
    }

    @Override
    public void setLeft(E left) {
        this.leftShoe = left;
    }

    @Override
    public void setRight(E right) {
        this.rightShoe = right;
    }
}
