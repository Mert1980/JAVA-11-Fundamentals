package cosmetics;

public class Perfume extends Product {

    public Perfume(int productNumber, String brand, String name, int volume, double price) {
        super(productNumber, brand, name, volume, price);
    }

    @Override
    public int compareTo(Product o) {
        return this.getBrand().compareTo(o.getBrand());
    }

}
