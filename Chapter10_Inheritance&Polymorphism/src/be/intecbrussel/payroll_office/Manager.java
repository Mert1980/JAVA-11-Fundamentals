package be.intecbrussel.payroll_office;

public class Manager extends Employee {
    public static final int MANAGER_FEE = 1000;

    public Manager(int year, String name, int no) {
        super(year, name, no);
        System.out.println("Triple sub constructor");
    }

    public Manager(String name, int year, int no) {
        System.out.println("Triple different sub constructor");
    }

    @Override
    public double calculateSalary(){
        return BASE_SALARY + MANAGER_FEE;
    }
}
