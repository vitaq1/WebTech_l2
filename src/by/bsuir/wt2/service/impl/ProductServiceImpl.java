package by.bsuir.wt2.service.impl;

import by.bsuir.wt2.dao.productDAO;
import by.bsuir.wt2.dao.DAOFactory;
import by.bsuir.wt2.product.Product;
import by.bsuir.wt2.service.ProductService;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

/**
 * ProductServiceImpl class
 * Implements ProductService.
 *
 * @author Vitali Shustovski
 * @version 1.0
 */
public class ProductServiceImpl implements ProductService {

    private final DAOFactory daoFactory = DAOFactory.getInstance();
    private final productDAO productDAO = daoFactory.getProductDAO();


    /**
     * {@inheritDoc}
     */
    @Override
    public List<Product> find(by.bsuir.wt2.product.type.Product product) {

        List<Product> products = null;
        try {
            products = productDAO.find(product);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
        return products;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Product findTheCheapest(by.bsuir.wt2.product.type.Product product) {
        List<Product> products = find(product);
        if (products == null || products.isEmpty()) {
            return null;
        }
        return products.stream()
                .min((a, b) -> (int) (a.getPrice() - b.getPrice()))
                .get();
    }
}
