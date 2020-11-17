package be.intecbrussel.customer;

public class CustomerFactory {
    final static String[] CUSTOMERS = {"Mert", "Asena", "Kaan", "Almira"};

    public static AbstractCustomer getCustomer (String name){
        for (String customerName:CUSTOMERS ) {
            if(customerName.equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
