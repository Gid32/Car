package ua.epamtask;

import java.time.Year;
import java.util.HashMap;

public class Parameters {
	private final static int firstCarYear = 1769;
	private final static int currentYear = Year.now().getValue();
	private final static int carProductionPeriod = currentYear - firstCarYear;
	
	static HashMap<String, String[]> models;
	
	static{
		models = new HashMap<String, String[]>();
		models.put("Audi", new String[]{"A4","A5","A6"});
		models.put("Mercedes-Benz", new String[]{"SL","SM","SS"});
	}
	
	static public int getRandomyearOfProduction(){
		return (int) (Math.random()*carProductionPeriod + firstCarYear);
	}

	static public String getRandomMark(){
		String Mark = models.keySet().toArray(new String[0])[(int) ((models.keySet().size())*Math.random())];
		
		return Mark;
	}
	
	static public String getRandomModel(String mark){
		String model = models.get(mark)[(int) ((models.get(mark).length)*Math.random())];
		return model;
	}
	
	static public String getRandomColor(){
		int i = (int) (Math.random()*11);
		switch (i){
			 case 1: return "BLUE";
			 case 2: return "CYAN";
			 case 3: return "GRAY";
			 case 4: return "GREEN";
			 case 5: return "MAGENTA";
			 case 6: return "ORANGE";
			 case 7: return "PINK";
			 case 8: return "RED";
			 case 9: return "WHITE";
			 case 10: return "YELLOW";
			 default: return "BLACK";
		}
	}
	
	static public int getRandomPrice(){
		return (int) (Math.random()*1000000)+1000;
	}
	
	static public String getRandomRegistrationNumber(){
		 return Long.toHexString((long) (Math.random()*Long.MAX_VALUE));
	}

	public static int getCurrentYear() {
		return currentYear;
	}
}
