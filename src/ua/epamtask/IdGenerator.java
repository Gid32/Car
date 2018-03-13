package ua.epamtask;

public class IdGenerator {
	private static long freeId = 0;
	
	public static long getFreeId(){
		long tmp = freeId;
		freeId++;
		return tmp;
	}
}
