package by.bsuir.wt2.product;

public class Oven extends Product {
    private double power;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public Oven(String[] args) {
        super(Double.parseDouble(args[0]));
        power = Double.parseDouble(args[1]);
        weight = Double.parseDouble(args[2]);
        capacity = Double.parseDouble(args[3]);
        depth = Double.parseDouble(args[4]);
        height = Double.parseDouble(args[5]);
        width = Double.parseDouble(args[6]);
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Oven {" +
                "power=" + power +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                ", price=" + getPrice() +
                '}';
    }
}
