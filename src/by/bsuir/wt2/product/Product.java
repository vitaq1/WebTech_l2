package by.bsuir.wt2.product;

public abstract class Product {
	private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(double price) {
        this.price = price;
    }
}
