package be.intecbrussel.customer;

public class NullPatternDemo {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Mert");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("asena");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("kaan");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Almira");
        AbstractCustomer customer5 = CustomerFactory.getCustomer("Yigit");

        System.out.println("Customers: ");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
        System.out.println(customer5.getName());

    }
}
