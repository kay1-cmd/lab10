/**
 * This class specifies methods for SchoolBus objects, which extends the Bus class.
 * Created 04/17/2022
 * 
 * @author Nia Jordan
 * Section 200
 */
public class SchoolBus extends Bus {
	private int maxChild;
	
	
	public SchoolBus() {
		maxChild = 10;
	}
	
	
	public boolean setMax(int x) {
		boolean valid = false;
		if(x > 0) {
			valid = true;
			maxChild = x;
		}
		return valid;
	}
	
public String toString() {
		
		return "Bus Name:  " + getName() + "\nMax Children: " + maxChild ;
	}
}
