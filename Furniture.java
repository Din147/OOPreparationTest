package Test4;

public class Furniture {
	private int height;
	private int width;

	public Furniture(int height, int width) throws Exception {
		this.height = height;
		this.width = width;
		if (this.height < 0) {
			throw new Exception("height must be positive");
		}
		if (this.width < 0) {
			throw new Exception("width must be positive");
		}

	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
}
