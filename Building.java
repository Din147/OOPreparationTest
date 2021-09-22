package Test4;

public class Building {
	private int buildingNumber;
	private Floor[] floors;

	public Building(int buildingNumber) throws Exception {
		this.buildingNumber = buildingNumber;

		floors = new Floor[20];
		for (int i = 0; i < floors.length; i++) {
			floors[i] = new Floor(i + 1);
		}
	}

	public int getBuildingNumber() {
		return buildingNumber;
	}

	public Floor[] getFloors() {
		return floors;
	}

	public String toString() {
		String str;
		str = "Building number " + getBuildingNumber() + " Conatins " + getFloors().length + " floors, \n";
		for (int i = 0; i < getFloors().length; i++) {
			str += "floor " + getFloors()[i].getFloorNumber() + " contains " + getFloors()[i].toString()+"\n";
		}
		return str;
	}

}
