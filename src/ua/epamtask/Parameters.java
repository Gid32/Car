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
		models.put("Audi", new String[]{"A4","A5","A6"});
	}
	
	static public int getRandomyearOfProduction(){
		return (int) (Math.random()*carProductionPeriod + firstCarYear);
	}

	static public String getRandomMark(){
		String Mark = models.keySet().toArray(new String[0])[(int) ((models.keySet().size()-1)*Math.random())];
		
		return Mark;
	}
	
	static public String getRandomModel(String mark){
		String model = models.get(mark)[(int) ((models.get(mark).length-1)*Math.random())];
		return model;
	}
	
	static public String getRandomColor(){
		int i = (int) (Math.random()*12);
		switch (i){
			 case 1: return "BLUE";
			 case 2: return "CYAN";
			 case 3: return "GRAY";
			 case 4: return "GRAY";
			 case 5: return "GREEN";
			 case 6: return "GRAY";
			 case 7: return "MAGENTA";
			 case 8: return "ORANGE";
			 case 9: return "PINK";
			 case 10: return "RED";
			 case 11: return "WHITE";
			 case 12: return "YELLOW";
			 default: return "BLACK";
		}
	}
	
	static public int getRandomPrice(){
		return (int) (Math.random()*1000000)+100000;
	}
	
	static public String getRandomRegistrationNumber(){
		 return Double.toHexString(Math.random()*Long.MAX_VALUE);
	}

	public static int getCurrentYear() {
		return currentYear;
	}
}
