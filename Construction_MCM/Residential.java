
public class Residential extends Building{
	
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	
	public Residential() {
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}//end empty constructor
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super.setProjectName(projectName);
		super.setCompleteAddress(completeAddress);
		super.setTotalSquareFeet(totalSquareFeet);
		super.setOccupancyGroup(occupancyGroup);
		super.setSubgroup(subgroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}//end preferred constructor
	
	
	
	//Getters and Setters
	public int getNumBedrooms() {
		return numBedrooms;
	}
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}
	public int getNumBathrooms() {
		return numBathrooms;
	}
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	
	
	
}//end class
