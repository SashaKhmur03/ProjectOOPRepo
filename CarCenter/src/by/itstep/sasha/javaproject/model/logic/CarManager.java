package by.itstep.sasha.javaproject.model.logic;

import by.itstep.sasha.javaproject.model.entity.Car;
import by.itstep.sasha.javaproject.model.entity.container.CarCenter;

public class CarManager {
    public static double getTotalCost(CarCenter carCenter){
        if (carCenter == null || carCenter.getSize() == 0) {
            return -1;
        }
        double totalCost = 0;

        for (Car car:carCenter.getCars() ) {
            totalCost += car.getPrice();
        }
        return totalCost;
    }
    public static double findTheMostExpensiveCar(CarCenter carCenter) {
        if (carCenter == null || carCenter.getSize() == 0) {
            return -1;
        }

        double mostExpensiveCar = 0;

        for (Car car : carCenter.getCars()) {
           mostExpensiveCar +=car.getPrice();

        }

        return mostExpensiveCar;

    }
}
