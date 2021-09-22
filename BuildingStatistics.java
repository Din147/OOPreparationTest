package Test4;

public class BuildingStatistics {
	public static void main(String[] args) {
		try {
			Building a = new Building(1);
			// System.out.println(a.toString());
			// HouseCommite(a);
			// Teants(a,HouseCommite(a));
			// Sumfurniture(a);

			// //Question 6
			// Tenants_30_50(a);
			// atLeaset40(a);
			// mostChairLegs(a);
			//biggestCloset(a);
			//mostFurnitureLegs(a);
			Tenants_70Pluse(a);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static double HouseCommite(Building a) {
		double counter = 0;
		int temp;
		int appartments = 0;
		for (int i = 0; i < a.getFloors().length; i++) {
			for (int j = 0; j < a.getFloors()[i].getApartments().length; j++) {
				appartments++;
				temp = a.getFloors()[i].getApartments()[j].getLastPayments().length - 1;
				counter += a.getFloors()[i].getApartments()[j].getLastPayments()[temp].getAmmount();
			}
		}
		System.out.println("sumHouseCommite is: " + counter);

		System.out.println("AverageHouseCommite is: " + counter / appartments);
		return counter;
	}

	public static void Teants(Building a, double sumHouseCommite) {
		int counter = 0;
		double sumHouseCommite1 = sumHouseCommite;

		for (int i = 0; i < a.getFloors().length; i++) {
			for (int j = 0; j < a.getFloors()[i].getApartments().length; j++) {
				for (int k = 0; k < a.getFloors()[i].getApartments()[j].getTenants().length; k++) {
					counter++;
				}
			}
		}
		System.out.println("sum teants are: " + counter);
		System.out.println("Average HouseCommite per teants are: " + sumHouseCommite1 / counter);

	}

	public static void Sumfurniture(Building a) {
		int chair = 0;
		int table = 0;
		int Closet = 0;

		for (int i = 0; i < a.getFloors().length; i++) {
			for (int j = 0; j < a.getFloors()[i].getApartments().length; j++) {
				for (int k = 0; k < a.getFloors()[i].getApartments()[j].getFurnitures().length; k++) {
					if (a.getFloors()[i].getApartments()[j].getFurnitures()[k] instanceof Chair) {
						chair++;
					}
					if (a.getFloors()[i].getApartments()[j].getFurnitures()[k] instanceof Table) {
						table++;
					}
					if (a.getFloors()[i].getApartments()[j].getFurnitures()[k] instanceof Closet) {
						Closet++;
					}
				}
			}
		}
		System.out.println("sum Chair on the bulding: " + chair + " sum Table on the bulding: " + table
				+ " sum Closet on the bulding: " + Closet);
	}

	// 6

	public static void Tenants_30_50(Building a) {
		int counter = 0;
		for (int i = 0; i < a.getFloors().length; i++) {
			for (int j = 0; j < a.getFloors()[i].getApartments().length; j++) {
				for (int k = 0; k < a.getFloors()[i].getApartments()[j].getTenants().length; k++) {
					int age = a.getFloors()[i].getApartments()[j].getTenants()[k].getAge();
					if (30 <= age && age <= 50) {
						counter++;
					}
				}
			}
		}
		System.out.println("number of Tenants 30-50 are: " + counter);
	}

	public static void atLeaset40(Building a) {
		double releative = 0;
		int Aptnum = 0;
		for (int i = 0; i < a.getFloors().length; i++) {
			for (int j = 0; j < a.getFloors()[i].getApartments().length; j++) {
				for (int k = 0; k < a.getFloors()[i].getApartments()[j].getTenants().length; k++) {
					int age = a.getFloors()[i].getApartments()[j].getTenants()[k].getAge();
					if (40 <= age) {
						Aptnum = a.getFloors()[i].getApartments()[j].getAptNumber();
						releative = 1 / ((double) a.getFloors()[i].getApartments()[j].getTenants().length);
						System.out.println("Appartments that has at least one 40 are: " + Aptnum + " relative payment "
								+ releative);

						break; // if there is one, not necessary to check more
					}
				}
			}
		}
	}

	public static void mostChairLegs(Building a) {
		int aptnum = 0;
		int max = 0;
		int legs = 0;
		for (int i = 0; i < a.getFloors().length; i++) {
			for (int j = 0; j < a.getFloors()[i].getApartments().length; j++) {
				for (int k = 0; k < a.getFloors()[i].getApartments()[j].getFurnitures().length; k++) {
					if (a.getFloors()[i].getApartments()[j].getFurnitures()[k] instanceof Chair) {
						legs = ((Chair) (a.getFloors()[i].getApartments()[j].getFurnitures()[k])).getLegs();
						if (max < legs) {
							max = legs;
							aptnum = a.getFloors()[i].getApartments()[j].getAptNumber();
						}
					}
				}
			}
		}
		System.out.println(" maximun chair's legs are: " + max + " at appartments: " + aptnum);
	}

	public static void biggestCloset(Building a) {
		int aptnum = 0;
		int max = 0;
		int height = 0;
		int Depth = 0;
		int width = 0;

		for (int i = 0; i < a.getFloors().length; i++) {
			for (int j = 0; j < a.getFloors()[i].getApartments().length; j++) {
				for (int k = 0; k < a.getFloors()[i].getApartments()[j].getFurnitures().length; k++) {
					if (a.getFloors()[i].getApartments()[j].getFurnitures()[k] instanceof Closet) {
						height = ((Closet) (a.getFloors()[i].getApartments()[j].getFurnitures()[k])).getHeight();
						Depth = ((Closet) (a.getFloors()[i].getApartments()[j].getFurnitures()[k])).getDepth();
						width = ((Closet) (a.getFloors()[i].getApartments()[j].getFurnitures()[k])).getWidth();

						if (max < height * Depth * width) {
							max = height * Depth * width;
							aptnum = a.getFloors()[i].getApartments()[j].getAptNumber();
						}
					}
				}
			}
		}
		System.out.println(" biggest Closetis: " + max + " at appartments: " + aptnum);

	}
	
	public static void mostFurnitureLegs(Building a) {
		int aptnum1 = 0;
		int aptnum2 = 0;
		int max1 = 0;
		int legs1 = 0;
		int max2 = 0;
		int legs2 = 0;
		for (int i = 0; i < a.getFloors().length; i++) {
			for (int j = 0; j < a.getFloors()[i].getApartments().length; j++) {
				for (int k = 0; k < a.getFloors()[i].getApartments()[j].getFurnitures().length; k++) {
					if (a.getFloors()[i].getApartments()[j].getFurnitures()[k] instanceof Chair) {
						legs1 = ((Chair) (a.getFloors()[i].getApartments()[j].getFurnitures()[k])).getLegs();
						if (max1 < legs1) {
							max1 = legs1;
							aptnum1 = a.getFloors()[i].getApartments()[j].getAptNumber();																						
						}
					}
					if (a.getFloors()[i].getApartments()[j].getFurnitures()[k] instanceof Table) {
						legs2 = ((Table) (a.getFloors()[i].getApartments()[j].getFurnitures()[k])).getLegs();
						if (max2 < legs2) {
							max2 = legs2;
							aptnum2 = a.getFloors()[i].getApartments()[j].getAptNumber();																						
						}
					}
				}
			}
		}
		if (max2 > max1) {
			System.out.println(" maximun furnituer legs is with a table with legs: " + max2 + " at appartments: " + aptnum2);
		}else {
			System.out.println(" maximun furnituer legs is a chair  with legs: " + max1 + " at appartments: " + aptnum1);

		}
	}
	
	public static void Tenants_70Pluse(Building a) {
		int counter = 0;
		int max=0;
		int floorNum=0;
		for (int i = 0; i < a.getFloors().length; i++) {
			for (int j = 0; j < a.getFloors()[i].getApartments().length; j++) {
				for (int k = 0; k < a.getFloors()[i].getApartments()[j].getTenants().length; k++) {
					int age = a.getFloors()[i].getApartments()[j].getTenants()[k].getAge();
					if (70 < age) {
						counter++;
					}
				}
			}
		if (max<counter) {
			max=counter;
			floorNum= i+1;
					}
		counter=0;
		}
		
		System.out.println("in floor " + floorNum+" there is the most 70+ " +max);
	}
}
