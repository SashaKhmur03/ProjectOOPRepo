package by.itstep.sasha.javaproject.controller;

import by.itstep.sasha.javaproject.model.entity.Car;
import by.itstep.sasha.javaproject.model.entity.container.CarCenter;
import by.itstep.sasha.javaproject.model.logic.CarManager;
import by.itstep.sasha.javaproject.view.Printer;


public class Main {
    public static void main(String[] args) {
        CarCenter carCenter = new CarCenter();

        Car car1 = new Car(100);
        Car car2 = new Car(100000);
        Car car3 = new Car(1666600);

        double totalCost = CarManager.getTotalCost(carCenter);
        Printer.print("Total cost of cars: " + totalCost);

        double mostExpensiveCar = CarManager.findTheMostExpensiveCar(carCenter);
        Printer.print("Most expensive car: " + mostExpensiveCar);
    }
}
