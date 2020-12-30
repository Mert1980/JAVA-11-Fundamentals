package cosmetics;

import java.util.ArrayList;
import java.util.Comparator;

public class Order {
    private ArrayList<Product> orders;
    private static int productNumber = 1000;

    public Order() {
        this.orders = new ArrayList<>();
    }

    public void addProduct(Product product){
        orders.add(product);
        productNumber++;
        product.setProductNumber(productNumber);
    }

    public static int getProductNumber() {
        return productNumber;
    }

    public void sortByBrand(){
        orders.sort(Product.sortByBrandName());

    }

    public void showList(){
        orders.stream().forEach(product -> System.out.println(product));
    }

    public void showByBrand(String brandName){
        orders.stream()
                .filter(product -> product.getBrand().equalsIgnoreCase(brandName))
                .forEach(brand -> System.out.println(brand));
    }

    public Product searchMostExpensiveProduct(){
        orders.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        return orders.get(0);
    }

    public void showPerfumes(){
        orders.stream().filter(order -> order instanceof Perfume).forEach(System.out::println);
    }
}
