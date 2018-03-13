package car;

import java.awt.Color;

public class Car {
	private static long freeId = 0;
	
	private final long id;
	private final String mark;
	private final String model;
	private final int yearOfProduction;
	
	private Color color;
	private int price;
	private String registrationNumber; 
	
	public Car(String mark, String model, int yearOfProduction){
		this.mark = mark;
		this.model = model;
		this.yearOfProduction = yearOfProduction;
		
		id = getFreeId();
	}
	

	public Car(long id, int yearOfProduction, int price, String mark, String model, String registrationNumber){
		this.id = id;
		this.yearOfProduction = yearOfProduction;
		this.setPrice(price);
		this.mark = mark;
		this.model = model;
		this.registrationNumber = registrationNumber;
	}
	
	public static long getFreeId(){
		long tmp = freeId;
		freeId++;
		return tmp;
	}

	public long getId() {
		return id;
	}
	

	public String getMark() {
		return mark;
	}

	public String getModel() {
		return model;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}


	private void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	
}
