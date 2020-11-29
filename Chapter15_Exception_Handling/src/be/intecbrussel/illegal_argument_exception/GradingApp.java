package be.intecbrussel.illegal_argument_exception;

public class GradingApp {
    public static void main(String[] args) {
        Grade grade = new Grade(3);
        System.out.println(grade.getGrade());

        Grade illegalGrade = new Grade(22);
        // exception happens, execution will not continue from here
    }
}
