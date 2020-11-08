package be.intecbrussel.payroll_office;

public class PayrollApp {
    public static void main(String[] args) {
        Employee[] employees = {new Employee(2000, "Ali", 34),
                                new Manager(2020, "Veli", 48),
                                new Director(2010, "Mehmet", 56),
                                };

        PayrollOffice office = new PayrollOffice();

        for (Employee emp:employees
             ) {
            office.paySalary(emp);
        }
    }
}
