package by.bsuir.wt2.product;

public class Refrigerator extends Product {
    private double power;
    private double weight;
    private double freezerCapacity;
    private double height;
    private double width;

    public Refrigerator(String[] args) {
        super(Double.parseDouble(args[0]));
        power = Double.parseDouble(args[1]);
        weight = Double.parseDouble(args[2]);
        freezerCapacity = Double.parseDouble(args[3]);
        height = Double.parseDouble(args[4]);
        weight = Double.parseDouble(args[5]);
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

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
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
        return "Refrigerator{" +
                "power=" + power +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", height=" + height +
                ", width=" + width +
                ", price=" + getPrice() +
                '}';
    }
}
