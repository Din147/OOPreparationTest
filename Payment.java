package Test4;

public class Payment {
	private payments types;
	private double ammount;

	public enum payments {
		household, electric, water,houseCommitte
	}

	public Payment(double ammount, payments types) throws Exception {
		this.ammount = ammount;
		if(this.ammount<0) {
			throw new Exception("ammount must be positive");
		}
	}

	public payments getTypes() {
		return types;
	}

	public double getAmmount() {
		return ammount;
	}

}
