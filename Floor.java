package Test4;

public class Floor {
private int floorNumber;
private Apartment[]	apartments; 


public Floor(int floorNumber) throws Exception {
	this.floorNumber=floorNumber;
	if (this.floorNumber<1 || this.floorNumber>20) {
		throw new Exception("floor must be 1-20");
	}
	apartments=new Apartment[4]; 
	for (int i=0; i<apartments.length;i++) {
		apartments[i]=new Apartment(floorNumber*10+(i+1), this.floorNumber); 
	}
}


public int getFloorNumber() {
	return floorNumber;
}


public Apartment[] getApartments() {
	return apartments;
}

public String toString() {
	String str;
	str=" appartments: 1-"+ getApartments().length +"\n"; 
	for (int i=0; i<apartments.length;i++) {
		str+="apartment " + getApartments()[i].getAptNumber()+" Contain "+getApartments()[i].getTenants().length +" Tenants, and "+getApartments()[i].getFurnitures().length+ " Furnitures \n";
		str+=getApartments()[i].toString() ;
	}
	return str;

}
}
