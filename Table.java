package Test4;

public class Table extends Furniture {
private int legs; 
private  int depth; 
private  String shape;
private int height;
private int width;

	public Table(int height, int width,int depth,int legs,String shape) throws Exception {
		super(height, width);
		
		this.height=height;
		this.width=width;
		this.depth=depth;
		this.legs=legs;
		this.shape=shape;
		
		if (this.legs<3) {
			throw new Exception("legs must be higher than 2");
		}
		if (this.depth<30) {
			throw new Exception("depth must be higher than 29");
		}
		if (!this.shape.equals("circle") && !this.shape.equals("square") && !this.shape.equals("rectangle")) {
			throw new Exception("must be valide shape ");
		}
	}

	public int getLegs() {
		return legs;
	}

	public int getDepth() {
		return depth;
	}

	public String getShape() {
		return shape;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

}
