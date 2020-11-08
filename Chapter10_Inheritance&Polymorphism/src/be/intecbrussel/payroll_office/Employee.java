package be.intecbrussel.payroll_office;

public class Employee {
    private int year;
    private String name;
    private int no;
    private String department;
    public static final int BASE_SALARY=2000;

    public Employee(int year, String name, int no, String department) {
        this.year = year;
        this.name = name;
        this.no = no;
        this.department = department;
        System.out.println("quadruple sub constructor");
    }

    public Employee(){
        System.out.println("Empty");
    }

    public Employee(int year, String name, int no){
        this(year,name,no, null);
        System.out.println("Triple super constructor");
    }

    public double calculateSalary(){
        return BASE_SALARY;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "EmployeeApp{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", no=" + no +
                ", department='" + department + '\'' +
                '}';
    }
}

