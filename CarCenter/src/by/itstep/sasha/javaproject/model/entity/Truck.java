package by.itstep.sasha.javaproject.model.entity;

public class Truck extends Car {
    private int loadCapacity;
    private int weight;

    public Truck() {
    }

    public Truck(double price, int loadCapacity, int weight) {
       super(price);
        this.loadCapacity = loadCapacity;
        this.weight = weight;
    }


    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                ", weight=" + weight +
                ", " + super.toString() + '}';
    }
}
