package cosmetics;

public class Deodorant extends Product{
    private DeoType deoType;

    public Deodorant(int productNumber, String brand, String name, int volume, double price, DeoType deoType) {
        super(productNumber, brand, name, volume, price);
        this.deoType = deoType;
    }

    @Override
    public int compareTo(Product o) {
        return this.getBrand().compareTo(o.getBrand());
    }

    @Override
    public String toString() {
        return "Deodorant{" + "deoType=" + deoType + '}';
    }

    public enum DeoType{
        VAPO, STICK;
    }
}
