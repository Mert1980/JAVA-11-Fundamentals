package be.intecbrussel.exercise04;

public class ShoePair<Shoe> implements Pair<Shoe>{
    private Shoe leftShoe;
    private Shoe rightShoe;

    public ShoePair() {
    }

    public ShoePair(Shoe leftShoe, Shoe rightShoe) {
        this.leftShoe = leftShoe;
        this.rightShoe = rightShoe;
    }

    @Override
    public Shoe getLeft() {
        return leftShoe;
    }

    @Override
    public Shoe getRight() {
        return rightShoe;
    }

    @Override
    public void setLeft(Shoe left) {
        this.leftShoe = left;
    }

    @Override
    public void setRight(Shoe right) {
        this.rightShoe = right;
    }
}
