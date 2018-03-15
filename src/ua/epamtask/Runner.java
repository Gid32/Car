package ua.epamtask;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Car> carMassive = new ArrayList<>();
        for (int i = 0; i < 200; i++) carMassive.add(CarFactory.createCar());

        for (Car car : CarUtils.getCarsOfGivenMark("Audi", carMassive)) System.out.println(car.toString());
        System.out.println();

        for (Car car : CarUtils.getCarsOfGivenModelAndLifeTime("A6", 5, carMassive)) System.out.println(car.toString());
        System.out.println();

        for (Car car : CarUtils.getCarsOfGivenYearOfProductionAndPrice(1995, 1000, carMassive)) System.out.println(car.toString());
    }
}
