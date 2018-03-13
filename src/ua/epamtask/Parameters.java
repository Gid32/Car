package ua.epamtask;

import java.time.Year;
import java.util.HashMap;
import java.awt.Color;

public class Parameters {
	private final static int firstCarYear = 1769;
	private final static int currentYear = Year.now().getValue();
	private final static int carProductionPeriod = currentYear - firstCarYear;
	
	static HashMap<String, String[]> Marks;
	
	static{
		Marks.put("Audi", new String[]{"A4","A5","A6"});
	}
	
	static public int getRandomyearOfProduction(){
		return (int) (Math.random()*carProductionPeriod + firstCarYear);
	}

	static public String getRandomMark(){
		
		String Mark = Marks.keySet().
		
		return ;
	}
	
	static public String getRandomModel(){
		
	}
	
	static public Color getRandomColor(){
		
	}
	
	static public int getRandomPrice(){
		
	}
	
	static public String getRandomRegistrationNumber(){
		
	}

	public static int getCurrentYear() {
		return currentYear;
	}
}
