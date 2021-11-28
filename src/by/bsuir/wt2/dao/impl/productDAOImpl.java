package by.bsuir.wt2.dao.impl;

import by.bsuir.wt2.dao.productDAO;
import by.bsuir.wt2.product.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * ProductDAO realisation class.
 *
 * @author Vitali Shustovski
 * @version 1.0
 */
public class productDAOImpl implements productDAO {
    private static final String DBPath = "src/by/bsuir/wt2/data/product_db.xml";


    /**
     * @param product by name
     * @return list of products
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    @Override
    public List<Product> find(by.bsuir.wt2.product.type.Product product) throws ParserConfigurationException, IOException, SAXException {
        Document document = getDocument();
        return getResultProducts(document.getElementsByTagName(product.getGroupSearchName()), product);
    }

    /**
     * Getting doc for parsing
     * @return Document
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    private Document getDocument() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        return documentBuilder.parse(new File(DBPath));
    }

    /**
     * Check matches
     * @param fields
     * @param product
     * @return
     */
    private boolean isMatches(NodeList fields, by.bsuir.wt2.product.type.Product product) {
        boolean isMatches = true;
        for (int j = 0; j < fields.getLength() && isMatches; j++) {
            if (fields.item(j).getNodeType() == Node.ELEMENT_NODE) {
                String name = fields.item(j).getNodeName();
                String value = fields.item(j).getTextContent();
                if (product.getCriteria().containsKey(name) &&
                        !product.getCriteria().get(name).toString().equals(value)) {
                    isMatches = false;
                }
            }
        }
        return isMatches;
    }

    /**
     * Get products
     * @param nodeList
     * @param product
     * @return list of products
     */
    private List<Product> getResultProducts(NodeList nodeList, by.bsuir.wt2.product.type.Product product) {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (isMatches(node.getChildNodes(), product)) {
                products.add(mapNodeToProducts(node));
            }
        }
        return products;
    }

    /**
     * mapping products
     * @param node
     * @return Product
     */
    private Product mapNodeToProducts(Node node) {
        String[] fields = getFieldsArray(node.getChildNodes());
        if (node.getNodeName().equals(Oven.class.getSimpleName())) {
            return new Oven(fields);
        } else if (node.getNodeName().equals(Refrigerator.class.getSimpleName())) {
            return new Refrigerator(fields);
        } else if (node.getNodeName().equals(Kettle.class.getSimpleName())) {
            return new Kettle(fields);
        } else {
            return new VacuumCleaner(fields);
        }
    }

    /**
     * get fields of Product
     * @param fieldsNodes
     * @return fields array
     */
    private String[] getFieldsArray(NodeList fieldsNodes) {
        String[] fields = new String[fieldsNodes.getLength() / 2];
        int i = 0;
        for (int j = 0; j < fieldsNodes.getLength(); j++) {
            if (fieldsNodes.item(j).getNodeType() == Node.ELEMENT_NODE) {
                fields[i++] = fieldsNodes.item(j).getTextContent();
            }
        }
        return fields;
    }
}
