package by.bsuir.wt2.service;


import by.bsuir.wt2.service.impl.ProductServiceImpl;

/**
 * ServiceFactory class with properties <b>instance</b> and <b>ProductService</b>.
 *
 * @author Vitali Shustovski
 * @version 1.0
 */
public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();
	private final ProductService productService = new ProductServiceImpl();
	
	private ServiceFactory() {}

	public ProductService getProductService() {
		return productService;
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

}
