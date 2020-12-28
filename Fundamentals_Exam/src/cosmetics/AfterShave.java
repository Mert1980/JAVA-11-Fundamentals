package cosmetics;

public class AfterShave extends Product{
    private Sort afterShaveType;

    public AfterShave(String brand, String name, int volume, double price, Sort afterShaveType) {
        super(brand, name, volume, price);
        this.afterShaveType = afterShaveType;
    }

    @Override
    public int compareTo(Product o) {
        return this.getBrand().compareTo(o.getBrand());
    }

    @Override
    public String toString() {
        return super.toString() + ", afterShaveType= " + afterShaveType;
    }

    public enum Sort{
        VAPO, GEL;
    }
}
