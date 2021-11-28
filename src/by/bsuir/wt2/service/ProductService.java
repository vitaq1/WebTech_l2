package by.bsuir.wt2.service;


import by.bsuir.wt2.product.Product;

import java.util.List;

/**
 * ProductService interface of an ProductService class.
 *
 * @author Vitali Shustovski
 * @version 1.0
 */
public interface ProductService {
    /**
     *
     * @param product search criteria
     * @return List of Products
     */
    List<Product> find(by.bsuir.wt2.product.type.Product product);

    /**
     *
     * @param product search criteria
     * @return Product
     */
    Product findTheCheapest(by.bsuir.wt2.product.type.Product product);
}
