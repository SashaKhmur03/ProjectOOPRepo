package by.itstep.sasha.javaproject.model.entity.container;

import by.itstep.sasha.javaproject.model.entity.Car;


public class CarCenter {
    public static final int DEFAULT_SIZE = 10;
    private Car[] cars;

    private int size = 0;

    public CarCenter() {
        cars = new Car[DEFAULT_SIZE];
    }

    public CarCenter(Car[] cars) {
        this.cars = cars;
        size = cars.length;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
