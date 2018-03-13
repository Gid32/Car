package ua.epamtask;

import java.util.ArrayList;

public class CarFactory {
	static public ArrayList<Car> makeRandomCarrsArray(int size){
		if (size <= 0) throw new IllegalArgumentException("size must be > 0");
		
		ArrayList<Car> carArray = new ArrayList<Car>();
		
		for (int i = 0; i < size; i++) {
			String mark = Parameters.getRandomMark();
			carArray.add(new Car(mark, 
					Parameters.getRandomModel(mark), 
					Parameters.getRandomyearOfProduction()));

			carArray.get(i).setColor(Parameters.getRandomColor());
			carArray.get(i).setPrice(Parameters.getRandomPrice());
			carArray.get(i).setRegistrationNumber(Parameters.getRandomRegistrationNumber());
		
		}
		return carArray;
	}

	static public Car createCar(long id, int yearOfProduction, int price, String mark, String model, String registrationNumber){
		return new Car(id, yearOfProduction, price, mark, model, registrationNumber);
	}
	
	static public Car createCar(){
		String mark = Parameters.getRandomMark();
		Car tmp = new Car(mark, 
				Parameters.getRandomModel(mark), 
				Parameters.getRandomyearOfProduction());

		tmp.setColor(Parameters.getRandomColor());
		tmp.setPrice(Parameters.getRandomPrice());
		tmp.setRegistrationNumber(Parameters.getRandomRegistrationNumber());
		
		
		return tmp;
	}
}
