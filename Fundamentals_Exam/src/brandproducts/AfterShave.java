package brandproducts;

public class AfterShave extends Product{
    private Sort afterShaveType;

    public AfterShave(int productNumber, String brand, String name, int volume, double price, Sort afterShaveType) {
        super(productNumber, brand, name, volume, price);
        this.afterShaveType = afterShaveType;
    }

    @Override
    public int compareTo(Product o) {
        return this.getBrand().compareTo(o.getBrand());
    }

    @Override
    public String toString() {
        return "AfterShave{" + "afterShaveType=" + afterShaveType + '}';
    }

    public enum Sort{
        VAPO, GEL;
    }
}
