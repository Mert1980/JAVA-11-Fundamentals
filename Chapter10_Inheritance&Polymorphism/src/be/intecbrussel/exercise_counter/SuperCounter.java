package be.intecbrussel.exercise_counter;

public class SuperCounter extends Counter{
    @Override
    public int addToNumber(int number) {
        return number + 5;
    }
}
