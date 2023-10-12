/**
 * This program prints the identification of different buses.
 * Created 04/17/2022
 * 
 * @author Nia Jordan
 * Section 200
 */

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		String name = "Generic Bus";
		String year = "2000";
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		
		
		Bus OGBus = new Bus(name, year);
		PartyBus partyB = new PartyBus();
		SchoolBus schoolB = new SchoolBus();
		
		partyB.setName("FunBus 777");
		schoolB.setName("FISD Bus 134");
		schoolB.setMax(50);
		
		partyB.setDays("Friday");
		partyB.setDays("Saturday");
		partyB.setDays("Sunday");
		
		buses.add(OGBus);
		buses.add(partyB);
		buses.add(schoolB);
		
		
		for(Bus x: buses) {
			System.out.println(x);
			System.out.println("_____________________________");
		}
    }
    
} 
	
	
	

