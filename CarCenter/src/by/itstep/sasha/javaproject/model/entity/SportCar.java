package by.itstep.sasha.javaproject.model.entity;

public class SportCar extends Car {
    private int maxSpeed;
    private double fuelConsumption;

    public SportCar() {
    }

    public SportCar(double price, int maxSpeed, double fuelConsumption) {
        super(price);
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                ", fuelConsumption=" + fuelConsumption +
                ", " + super.toString() + '}';
    }
}
