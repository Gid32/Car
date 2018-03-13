package car;

import java.time.Year;
import java.awt.Color;

public class Parameters {
	private final static int firstCarYear = 1769;
	private final static int currentYear = Year.now().getValue();
	private final static int carProductionPeriod = currentYear - firstCarYear;
	
	static public int getRandomyearOfProduction(){
		return (int) (Math.random()*carProductionPeriod + firstCarYear);
	}

	static public String getRandomMark(){
		
		return null;
	}
	
	static public String getRandomModel(){
		
	}
	
	static public Color getRandomColor(){
		
	}
	
	static public int getRandomCost(){
		
	}
	
	static public String getRandomRegistrationNumber(){
		
	}
}
