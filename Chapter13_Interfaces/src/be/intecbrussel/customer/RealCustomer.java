package be.intecbrussel.customer;

public class RealCustomer extends AbstractCustomer{
    private String name;

    public RealCustomer(String name){
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return "Customer name is " + this.name;
    }
}
