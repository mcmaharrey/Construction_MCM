
public class Apartment extends Residential{
	
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	public Apartment() {
		super();
		numRentableUnits = 0;
		avgUnitSize = 0;
		parkingAvailable = false;
	}//end empty constructor

	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super.setProjectName(projectName);
		super.setCompleteAddress(completeAddress);
		super.setTotalSquareFeet(totalSquareFeet);
		super.setOccupancyGroup(occupancyGroup);
		super.setSubgroup(subgroup);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}//end preferred constructor

	public void draw() {
		 System.out.println(" Drawing code for " + this.getClass().getSimpleName());
	}//end draw
	
	public String displayData() {
		String parkingAvailableString = parkingAvailable ? "Yes" : "No";
		String laundryRoomString = laundryRoom ? "Yes" : "No";
		 return   " Project Name: " + projectName + "\n "
				  + "Address: "+ completeAddress + "\n "
				  + "Square Feet: " + totalSquareFeet + "\n "
				  + "Occupancy Group: " + occupancyGroup+ "\n "
				  + "Occupancy Subgroup: " + subgroup +"\n "
				  + "Number of Bedrooms: " + numBedrooms + "\n "
				  + "Number of Bathrooms: " + numBathrooms + "\n "
				  + "Laundry Room: " + laundryRoomString + "\n "
				  + "Number of Rentable Units: " + numRentableUnits + "\n "
				  + "Average Unit Size: " + avgUnitSize + "\n "
				  + "Parking Available: " + parkingAvailableString + "\n ";
						
	}//end displayData

	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}

	
	
}//end class
