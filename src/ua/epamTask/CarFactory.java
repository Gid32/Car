package car;

import car.Car;

import java.util.ArrayList;

public class CarFactory {
	static public ArrayList<Car> makeRandomCarrsArray(int size){
		if (size <= 0) throw new IllegalArgumentException("size must be > 0");
		
		ArrayList<Car> carArray = new ArrayList<Car>();
		
		for (int i = 0; i < size; i++) {
			carArray.add(new Car(Parameters.getRandomMark(), 
					Parameters.getRandomModel(), 
					Parameters.getRandomyearOfProduction()));

			carArray.get(i).setColor(Parameters.getRandomColor());
			carArray.get(i).setCost(Parameters.getRandomCost());
			carArray.get(i).setRegistrationNumber(Parameters.getRandomRegistrationNumber());
		
		}
		return carArray;
	}

	static public Car createCar(){
			Car tmp = new Car(Parameters.getRandomMark(), 
					Parameters.getRandomModel(), 
					Parameters.getRandomyearOfProduction());

			tmp.setColor(Parameters.getRandomColor());
			tmp.setPrice(Parameters.getRandomCost());
			tmp.setRegistrationNumber(Parameters.getRandomRegistrationNumber());
		
		}
		return carArray;
	}
}
