package by.itstep.sasha.javaproject.model.logic;

import by.itstep.sasha.javaproject.model.entity.Bus;
import by.itstep.sasha.javaproject.model.entity.Car;
import by.itstep.sasha.javaproject.model.entity.SportCar;
import by.itstep.sasha.javaproject.model.entity.Truck;
import by.itstep.sasha.javaproject.model.entity.container.CarCenter;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarManagerTest {

    @Test
    public void testTotalCost(){
        Car[] cars = {new SportCar(100000, 300, 12.5),
            new Bus(50, 10000, true),
            new Truck(50000, 5, 30)};

        CarCenter carCenter = new CarCenter(cars);

        double expected = 160000.0;
        double actual = CarManager.findTheMostExpensiveCar(carCenter);

        assertEquals(expected, actual, 0.001);
    }



    @Test
    public void testFindTheMostExpensiveCarPositive() {
        Car[] cars = {new SportCar(100000, 300, 12.5)};

        CarCenter carCenter = new CarCenter(cars);

        double expected = 100000.0;

        double actual = CarManager.findTheMostExpensiveCar(carCenter);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindTheMostExpensiveCarByNull() {
        double expected = -1;

        double actual = CarManager.findTheMostExpensiveCar(null);

        assertEquals(expected, actual, 0.0);
    }
}
