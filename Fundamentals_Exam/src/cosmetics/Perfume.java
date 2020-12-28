package cosmetics;

public class Perfume extends Product {

    public Perfume(String brand, String name, int volume, double price) {
        super(brand, name, volume, price);
    }

    @Override
    public int compareTo(Product o) {
        return this.getBrand().compareTo(o.getBrand());
    }



}
