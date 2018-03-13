package ua.epamtask;

import java.time.Year;
import java.util.HashMap;
import java.awt.Color;

public class Parameters {
	private final static int firstCarYear = 1769;
	private final static int currentYear = Year.now().getValue();
	private final static int carProductionPeriod = currentYear - firstCarYear;
	
	static HashMap<String, String[]> models;
	
	static{
		models = new HashMap<String, String[]>();
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
	
	static public Color getRandomColor(){
		int i = (int) (Math.random()*12);
		switch (i){
			 case 1: return Color.BLUE;
			 case 2: return Color.CYAN;
			 case 3: return Color.DARK_GRAY;
			 case 4: return Color.GRAY;
			 case 5: return Color.GREEN;
			 case 6: return Color.LIGHT_GRAY;
			 case 7: return Color.MAGENTA;
			 case 8: return Color.ORANGE;
			 case 9: return Color.PINK;
			 case 10: return Color.RED;
			 case 11: return Color.WHITE;
			 case 12: return Color.YELLOW;
			 default: return Color.BLACK;
		}
	}
	
	static public int getRandomPrice(){
		return (int) (Math.random()*Integer.MAX_VALUE);
	}
	
	static public String getRandomRegistrationNumber(){
		 return Double.toHexString(Math.random()*Long.MAX_VALUE);
	}

	public static int getCurrentYear() {
		return currentYear;
	}
}
