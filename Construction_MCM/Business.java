
public class Business extends Building{
	
	protected int numRentableUnits;
	
	public Business() {
		
		super();
		numRentableUnits = 0;
	}//end empty constructor
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) {
		
		super.setProjectName(projectName);
		super.setCompleteAddress(completeAddress);
		super.setTotalSquareFeet(totalSquareFeet);
		super.setOccupancyGroup(occupancyGroup);
		super.setSubgroup(subgroup);
		this.numRentableUnits = numRentableUnits;
		
	}//end preferred constructor

	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	

	
}//end class
