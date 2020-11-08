package be.intecbrussel.payroll_office;

public class Director extends Manager {
    public static final int DIRECTOR_FEE = 1000;

    public Director(int year, String name, int no) {
        super(year, name, no);
    }

    @Override
    public double calculateSalary(){
        return Employee.BASE_SALARY + Manager.BASE_SALARY + DIRECTOR_FEE;
    }
}
