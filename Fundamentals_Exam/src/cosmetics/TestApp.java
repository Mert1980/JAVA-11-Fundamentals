package cosmetics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestApp {
    public static void main(String[] args) {
        Product product1 = new Deodorant("Cacharel", "Anais", 50, 24.5, Deodorant.DeoType.VAPO);
        Product product2 = new Deodorant("DKNY", "Be Delicious Women", 100, 33.65, Deodorant.DeoType.STICK);
        Product product3 = new Perfume("Georgio Armani", "Code Donna", 50, 59.32);
        Product product4 = new Perfume("BVLGARI", "BLV", 75, 61.52);
        Product product5 = new AfterShave("Yves Saint Laurent", "Jazz", 100, 57.76, AfterShave.Sort.GEL);
        Product product6 = new Perfume("Dolce & Gabbana", "Light Blue", 100, 66.72);
        Product product7 = new Perfume("Givency", "Absolute Irresistible", 75, 75.42);

        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);
        order.addProduct(product4);
        order.addProduct(product5);
        order.addProduct(product6);
        order.addProduct(product7);

        // show list
        order.showList();
        System.out.println("------------------------");

        // sort by brand
        order.sortByBrand();
        order.showList();
        System.out.println("------------------------");

        // sort by brand
        order.showByBrand("Dolce & Gabbana");
        System.out.println("------------------------");

        // show most expensive product
        System.out.println(order.searchMostExpensiveProduct());
        System.out.println("------------------------");

        // show perfumes
        order.showPerfumes();


    }
}
