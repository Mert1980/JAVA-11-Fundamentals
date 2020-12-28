package cosmetics;

public class Deodorant extends Product{
    private DeoType deoType;

    public Deodorant(String brand, String name, int volume, double price, DeoType deoType) {
        super(brand, name, volume, price);
        this.deoType = deoType;
    }

    public DeoType getDeoType() {
        return deoType;
    }

    @Override
    public int compareTo(Product o) {
        return this.getBrand().compareTo(o.getBrand());
    }

    @Override
    public String toString() {
        return super.toString() + ", deoType= " + deoType;
    }

    public enum DeoType{
        VAPO, STICK;
    }
}
