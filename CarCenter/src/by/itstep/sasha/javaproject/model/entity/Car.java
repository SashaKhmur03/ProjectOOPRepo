package by.itstep.sasha.javaproject.model.entity;

public class Car {
    private double price;

    public Car() {
    }

    public Car(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws Exception {
        if (price > 0) {
            this.price = price;
        } else {
            throw new Exception();
        }
    }

    @Override
    public String toString() {
        return "price=" + price;
    }
}
