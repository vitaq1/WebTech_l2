package by.bsuir.wt2.dao;


import by.bsuir.wt2.product.Product;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

/**
 * ApplianceDAO interface of an applianceDao class.
 *
 * @author Vitali Shustovski
 * @version 1.0
 */
public interface productDAO {

	/**
	 * Finds all Appliance that match the given criteria.
	 *
	 * @param product search criteria
	 * @return List of Appliance
	 * @throws ParserConfigurationException exception when problems with parsing xml
	 * @throws IOException ioexception
	 * @throws SAXException exception when problems with parsing xml
	 */
	List<Product> find(by.bsuir.wt2.product.type.Product product) throws ParserConfigurationException, IOException, SAXException;
}
