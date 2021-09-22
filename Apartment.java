package Test4;

import java.util.Random;

import Test4.Payment.payments;

public class Apartment {
	private int aptNumber;
	private Tenant[] tenants;
	private Payment[] lastPayments;
	private Furniture[] furnitures;
	private int floorNumber; 

	public Apartment(int aptNumber,int floorNumber) throws Exception {
		this.aptNumber = aptNumber;
		this.floorNumber= floorNumber;
		if (this.aptNumber < 1 || this.aptNumber > 205) {
			throw new Exception("apt num must be beween 1-200");
		}
		Random r1 = new Random();
		tenants = new Tenant[r1.nextInt(8) + 1];
		for (int i = 0; i < tenants.length; i++) {
			tenants[i] = new Tenant();
		}

		lastPayments = new Payment[5];
		payments temp[] = { payments.household, payments.electric, payments.water, payments.houseCommitte };
		for (int i = 0; i < lastPayments.length - 1; i++) {
			lastPayments[i] = new Payment(r1.nextInt(100), temp[r1.nextInt(3)]);
		}
		lastPayments[lastPayments.length-1] = new Payment(CalcAmmount(), payments.houseCommitte); // goback

		furnitures = new Furniture[10];
		for (int i = 0; i < furnitures.length; i++) {
			Random r2 = new Random();
			int RandomA = (r2.nextInt(3) + 1);
			
			if (RandomA == 1) {
				furnitures[i] = new Chair(r2.nextInt(100), r2.nextInt(100), r2.nextInt(10) + 3);
			}
			if (RandomA == 2) {
				furnitures[i] = new Closet(r2.nextInt(100), r2.nextInt(100), r2.nextInt(100)+10);
			}
			if (RandomA == 3) {
				Random r3 = new Random();
				int RandomB= (r3.nextInt(3) + 1);
				if (RandomB == 1) {
					furnitures[i] = new Table(r2.nextInt(100), r2.nextInt(100), r2.nextInt(10) + 30,
							r2.nextInt(100) + 3, "circle");
				}
				if (RandomB == 2) {
					furnitures[i] = new Table(r2.nextInt(100), r2.nextInt(100), r2.nextInt(10) + 30,
							r2.nextInt(100) + 3, "square");
				}
				if (RandomB == 3) {
					furnitures[i] = new Table(r2.nextInt(100), r2.nextInt(100), r2.nextInt(10) + 30,
							r2.nextInt(100) + 3, "rectangle");
				}

			}

		}

	}

	public double CalcAmmount() {
		double ammount =100; 
		if(getTenants().length>1) {
			ammount+= (getTenants().length-1)*20;
		}
		if(getFloorNumber()>1) {
			ammount+= (getFloorNumber()-1)*10;
		}
		return ammount;
	}
	
	public int getAptNumber() {
		return aptNumber;
	}

	public Tenant[] getTenants() {
		return tenants;
	}

	public Payment[] getLastPayments() {
		return lastPayments;
	}

	public Furniture[] getFurnitures() {
		return furnitures;
	}
	public int getFloorNumber(){
		return floorNumber;
	}

	public String toString() {
		String str="";
		int counterChair = 0;
		int counterTable = 0;
		int counterCloset = 0;
		
		for (int i = 0; i < furnitures.length; i++) {
			if (getFurnitures()[i] instanceof Chair) {
				counterChair++;
			}
			if (getFurnitures()[i] instanceof Table) {
				counterTable++;
			}
			if (getFurnitures()[i] instanceof Closet) {
				counterCloset++;
			}
		}
		str += "furnitures are: " + counterChair + " Chairs " + counterTable + " Tables " + counterCloset
				+ " Closet \n";
		str += "houseCommitte payment is " + getLastPayments()[getLastPayments().length-1].getAmmount()+ "\n";
		return str;
	}

}
