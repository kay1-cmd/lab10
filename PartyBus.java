/**
 * This class specifies methods for PartyBus objects, which extends the Bus class.
 * Created 04/17/2022
 * 
 * @author Nia Jordan
 * Section 200
 */
import java.util.ArrayList;

public class PartyBus extends Bus{
	
	
	ArrayList<String> operationDays = new ArrayList<>();
	
	
	
	
	public void setDays(String s) {
		operationDays.add(s);
	}
	
	
	public String toString() {
		
		return "Bus Name:  " + getName() + "\nDays in Service: " + operationDays ;
	}
	
}

