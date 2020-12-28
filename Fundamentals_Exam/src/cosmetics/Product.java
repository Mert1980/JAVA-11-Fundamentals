package cosmetics;

import java.util.Comparator;

public abstract class Product implements Comparable<Product> {
    private int productNumber;
    private String brand;
    private String name;
    private int volume;
    private double price;

    public Product(String brand, String name, int volume, double price) {
        this.brand = brand;
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    // GETTERS
    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public double getPrice() {
        return price;
    }

    public int getProductNumber() {
        return productNumber;
    }

    // SETTERS


    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductCode(){
        StringBuilder sb = new StringBuilder();
        String brandCode = getBrand().substring(0, 3);
        String nameCode = getName().substring(0,3);
        sb.append(brandCode).append(nameCode).append(getVolume());

        return sb.toString().toUpperCase()
                .trim().replace(" ", "_");
    };

    public static Comparator<Product> sortByBrandName(){
        return new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getBrand().toLowerCase().compareTo(o2.getBrand().toLowerCase());
            }
        };
    }

    @Override
    public String toString() {
        String productCode = getProductCode();
        return getProductNumber() + " brand='" + brand + '\''
                + ", name='" + name + '\'' + ", volume=" + volume + ", price=" + price
                + ", code= " + productCode;
    }
}
