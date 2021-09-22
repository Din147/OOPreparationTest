package Test4;

public class Chair extends Furniture {
	private int legs; 
	private int height;
	private int width;
	
	public Chair(int height, int width,int legs) throws Exception {
		super(height, width);
	
		this.legs=legs; 
		this.height=height;
		this.height=width; 
		
		if (this.legs<3) {
			throw new Exception("legs must be higher than 2");
		}
		
	}

	public int getLegs() {
		return legs;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

}
