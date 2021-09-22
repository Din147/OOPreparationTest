package Test4;

public class Closet extends Furniture {
	private int depth;
	private int height;
	private int width;

	public Closet(int height, int width,int depth) throws Exception {
		super(height, width);

		 this.height=height;
		this.width=width;
		this.depth=depth;
		
		if (this.depth<10) {
			throw new Exception("depth must be higher than 9");
		}
		
	}

	public int getDepth() {
		return depth;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

}
