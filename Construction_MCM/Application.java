
public class Application {

	public static void main(String[] args) {
	 
		Building B = new Building();
		System.out.println(B.displayData());
		
		B.draw();
		B.setProjectName("Building Name");
		B.setCompleteAddress("Building Address");
		B.setTotalSquareFeet(0000);
		B.setOccupancyGroup("Business");
		B.setSubgroup("B");
		System.out.println(B.displayData());
		
		Mall M = new Mall();
		System.out.println(M.displayData());
		
		M.draw();
		M.setProjectName("Starcourt Mall");
		M.setCompleteAddress("123 Starcourt Road | Louisville, KY, 40242");
		M.setTotalSquareFeet(33000);
		M.setOccupancyGroup("Business");
		M.setSubgroup("B");
		M.setNumRentableUnits(50);
		M.setNumRentedUnits(34);
		M.setMedianUnitSize(300);
		M.setNumParkingSpaces(1000);
		System.out.println(M.displayData());
		
		Apartment APT = new Apartment();
		System.out.println(APT.displayData());
		
		APT.draw();
		APT.setProjectName("Oak Dale");
		APT.setCompleteAddress("123 Oak Drive | Louisville, KY, 40201");
		APT.setTotalSquareFeet(13000);
		APT.setOccupancyGroup("Residential");
		APT.setSubgroup("R2");
		APT.setNumBedrooms(2);
		APT.setNumBathrooms(1);
		APT.setLaundryRoom(true);
		APT.setNumRentableUnits(3);
		APT.setAvgUnitSize(1000);
		APT.setParkingAvailable(true);
		System.out.println(APT.displayData());
		
		SingleFamilyHome SFH = new SingleFamilyHome();
		System.out.println(SFH.displayData());
		
		SFH.draw();
		SFH.setProjectName("Oak Dale");
		SFH.setCompleteAddress("123 Oak Drive | Louisville, KY, 40201");
		SFH.setTotalSquareFeet(13000);
		SFH.setOccupancyGroup("Residential");
		SFH.setSubgroup("R2");
		SFH.setNumBedrooms(3);
		SFH.setNumBathrooms(2);
		SFH.setLaundryRoom(true);
		SFH.setGarage(true);
		System.out.println(SFH.displayData());
	
	}//end main

	
}//end class
