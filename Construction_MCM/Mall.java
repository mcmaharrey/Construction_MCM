
public class Mall extends Business{
	
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	public Mall() {
		
		super();
		numRentedUnits = 0;
		medianUnitSize = 0.0;
		numParkingSpaces = 0;
	}//end empty constructor
	
	public Mall(String projectName, String completeAddress, Double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		super.setProjectName(projectName);
		super.setCompleteAddress(completeAddress);
		super.setTotalSquareFeet(totalSquareFeet);
		super.setOccupancyGroup(occupancyGroup);
		super.setSubgroup(subgroup);
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
		
	}//end preferred constructor

	public void draw() {
		 System.out.println(" Drawing code for " + this.getClass().getSimpleName());
	}//end draw
	
	public String displayData() {
		 return   " Project Name: " + projectName + "\n "
				  + "Address: "+ completeAddress + "\n "
				  + "Square Feet: " + totalSquareFeet + "\n "
				  + "Occupancy Group: " + occupancyGroup+ "\n "
				  + "Occupancy Subgroup: " + subgroup +"\n "
				  + "Number of Rentable Units " + numRentableUnits +"\n "
				  + "Number of Rented Units: " + numRentedUnits + "\n "
				  + "Median Unit Size: " + medianUnitSize + "\n "
				  + "Number of Parking Spaces " + numParkingSpaces + "\n ";
	
	}//end displayData
	
	//Getters and Setters
	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	
}//end class
