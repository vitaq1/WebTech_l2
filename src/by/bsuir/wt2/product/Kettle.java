package by.bsuir.wt2.product;

public class Kettle extends Product {
    private double capacity;
    private String color;

    public Kettle(String[] args) {
        super(Double.parseDouble(args[0]));
        capacity = Double.parseDouble(args[1]);
        color = args[2];
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "capacity=" + capacity +
                ", color='" + color + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
