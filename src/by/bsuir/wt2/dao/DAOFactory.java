package by.bsuir.wt2.dao;


import by.bsuir.wt2.dao.impl.productDAOImpl;


public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();
	private final productDAO productDAO = new productDAOImpl();
	
	private DAOFactory() {}

	public productDAO getProductDAO() {
		return productDAO;
	}

	public static DAOFactory getInstance() {
		return instance;
	}
}
