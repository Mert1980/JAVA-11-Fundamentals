package be.intecbrussel.exercise11_01;

public enum Day {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private boolean isWorkDay;

    private Day(boolean isWorkDay){
        this.isWorkDay = isWorkDay;
    }

    public boolean isWorkDay() {
        return isWorkDay;
    }

    @Override
    public String toString() {
        return  name() + " (" + isWorkDay + ")";
    }
}
