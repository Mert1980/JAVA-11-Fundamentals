package be.intecbrussel.customer;

public class CustomerFactory {
    final static String[] customers = {"Mert", "Asena", "Kaan", "Almira"};

    public static AbstractCustomer getCustomer (String name){
        for (String customerName:customers ) {
            if(customerName.equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
