class Image extends File implements Rotatable, Resizable {
	private int rotation;
	private int height;
	private int width;

	public Image(int width, int height, int rotation) {
		this.height = height;
		this.width = width;
		this.rotation = rotation;
	}

	public int getRotation() {
		return this.rotation;
	}

	public void setRotation(int r) {
		this.rotation = r;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int h) {
		this.height = h;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int w) {
		this.width = w;
	}
}
