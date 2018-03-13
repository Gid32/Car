package ua.epamtask;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Car> carMassive = new ArrayList<>();
        for (int i = 0; i < 20; i++) carMassive.add(CarFactory.createCar());

        for (Car car : CarUtils.getCarsOfGivenMark("Audi", carMassive)) car.toString();

        for (Car car : CarUtils.getCarsOfGivenModelAndLifeTime("a2", 5, carMassive)) car.toString();

        for (Car car : CarUtils.getCarsOfGivenYearOfProductionAndPrice(1995, 1000, carMassive)) car.toString();
    }
}
