package by.bsuir.wt2.product.type;

import java.util.HashMap;
import java.util.Map;

/**
 * Product class with properties <b>product</b>, <b>groupSearchName</b>.
 *
 * @author Vitali Shustouski
 * @version 1.0
 */
public class Product {

	private final String groupSearchName;
	private final Map<String, Object> criteria = new HashMap<String, Object>();

	public Product(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public String getGroupSearchName() {
		return groupSearchName;
	}

	public Map<String, Object> getCriteria() {
		return criteria;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}
}
