/**
 * This class specifies methods available for Bus objects. 
 * Created 04/17/2022
 * 
 * @author Nia Jordan
 * Section 200
 */
public class Bus {
	private String name;
	private String year;
	
	public Bus(){
		name = "Bus 1";
		year = null;
		
	}
	
	public Bus(String n, String y) {
		name = n;
		year = y;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	
	public void setYear(String y) {
		year = y;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public String getYear() {
		return year;
	}
	
	
	public String toString() {
		return "Bus Name: " + name + "\nYear built: " + year;
	}
	
	
	public boolean equals(Bus x) {
		boolean retVal = false;
		if(this.name == x.name && this.year == x.year )
			retVal = true;
		
		return retVal;
	}
	
}



