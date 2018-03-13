package ua.epamtask;

public class CarFactory {
	static public Car createCar(long id, int yearOfProduction, int price, String mark, String model, String registrationNumber){
		return new Car(id, yearOfProduction, price, mark, model, registrationNumber);
	}
	
	static public Car createCar(){
		String mark = Parameters.getRandomMark();
		
		Car tmp =  new Car(IdGenerator.getFreeId(), 
				Parameters.getRandomyearOfProduction(), 
				Parameters.getRandomPrice(), 
				mark, 
				Parameters.getRandomModel(mark), 
				Parameters.getRandomRegistrationNumber());
		tmp.setColor(Parameters.getRandomColor());
		return tmp;
	}
}
