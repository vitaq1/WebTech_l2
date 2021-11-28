package by.bsuir.wt2.main;

import by.bsuir.wt2.product.Product;
import by.bsuir.wt2.product.type.SearchProducts;
import by.bsuir.wt2.service.ProductService;
import by.bsuir.wt2.service.ServiceFactory;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		ServiceFactory factory = ServiceFactory.getInstance();
		ProductService service = factory.getProductService();

		by.bsuir.wt2.product.type.Product crit = new by.bsuir.wt2.product.type.Product(SearchProducts.Appliance.class.getSimpleName());

		by.bsuir.wt2.product.type.Product productOven = new by.bsuir.wt2.product.type.Product(SearchProducts.Kettle.class.getSimpleName());
		List<Product> ovenList = service.find(productOven);
		ProductInfoPrinter.print(ovenList);
		System.out.println("------------------------");



		List<Product> all = (List<Product>) service.findTheCheapest(crit);
		ProductInfoPrinter.print(all);
	}
}
