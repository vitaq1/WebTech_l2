package by.bsuir.wt2.main;

import by.bsuir.wt2.product.Product;

import java.util.List;

/**
 * PrinterProductInfo class.
 * Class for printing info about found products.
 *
 * @author Vitali Shustovski
 * @version 1.0
 */
public class ProductInfoPrinter {

    public static void print(List<Product> products) {
        if (products == null) {
            System.out.println("Wrong type of the product");
            return;
        }
        if (products.isEmpty()) {
            System.out.println("Nothing found");
            return;
        }
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void print(Product product) {
        if (product == null) {
            System.out.println("Nothing found");
            return;
        }
        System.out.println(product);
    }
}
