package brandproducts;

public class Parfume extends Product {

    public Parfume(int productNumber, String brand, String name, int volume, double price) {
        super(productNumber, brand, name, volume, price);
    }

    @Override
    public int compareTo(Product o) {
        return this.getBrand().compareTo(o.getBrand());
    }

}
