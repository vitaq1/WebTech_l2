package by.bsuir.wt2.product.type;


/**
 * SearchProducts class.
 * Contains all search products.
 *
 * @author Vitali Shustovski
 * @version 1.0
 */
public final class SearchProducts {

	public static enum Appliance {
		PRICE;
	}
	
	public static enum Oven{
		POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
	}

	public static enum Refrigerator{
		POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
	}
	
	public static enum VacuumCleaner{
		POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
	}
	
	public static enum Kettle{
		CAPACITY, COLOR
	}

	private SearchProducts() {}
}

