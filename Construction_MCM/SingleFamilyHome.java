
public class SingleFamilyHome extends Residential{
	
	private boolean garage; 
	
	public SingleFamilyHome() {
		
		super();
		garage = false;
	}//end empty constructor

	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super.setProjectName(projectName);
		super.setCompleteAddress(completeAddress);
		super.setTotalSquareFeet(totalSquareFeet);
		super.setOccupancyGroup(occupancyGroup);
		super.setSubgroup(subgroup);
		super.numBedrooms = numBedrooms;
		super.numBathrooms = numBathrooms;
		super.laundryRoom = laundryRoom;
		this.garage = garage;
	}//end preferred constructor

	public void draw() {
		 System.out.println(" Drawing code for " + this.getClass().getSimpleName());
	}
	
	public String displayData() {
		String laundryRoomString = laundryRoom ? "Yes" : "No";
		String garageString = garage ? "Yes" : "No";
		return
		   " Project Name: " + projectName + "\n "
		  + "Address: "+ completeAddress + "\n "
		  + "Square Feet: " + totalSquareFeet + "\n "
		  + "Occupancy Group: " + occupancyGroup+ "\n "
		  + "Occupancy Subgroup: " + subgroup +"\n "
		  + "Number of Bedrooms: " + numBedrooms + "\n "
		  + "Number of Bathrooms: " + numBathrooms + "\n "
		  + "Laundry Room: " + laundryRoomString + "\n "
		  + "Garage: " + garageString + "\n ";
		 
	}//end displayData

	//Getters and Setters
	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	
}//end class
