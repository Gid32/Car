package ua.epamtask;


import java.util.ArrayList;

public class CarUtils {

    public static ArrayList<Car> getCarsOfGivenMark(String mark, ArrayList<Car> cars) {
        ArrayList<Car> givenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMark().equals(mark)) givenCars.add(car);
        }
        return givenCars;
    }

    public static ArrayList<Car> getCarsOfGivenModelAndLifeTime(String model, int lifeTime, ArrayList<Car> cars) {
        ArrayList<Car> givenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().equals(model) && (Parameters.getCurrentYear() - car.getYearOfProduction()) > lifeTime)
                givenCars.add(car);
        }
        return givenCars;
    }

    public static ArrayList<Car> getCarsOfGivenYearOfProductionAndPrice(int yearOfProduction, int price, ArrayList<Car> cars) {
        ArrayList<Car> givenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYearOfProduction() == yearOfProduction && car.getPrice() > price) givenCars.add(car);
        }
        return givenCars;
    }
}