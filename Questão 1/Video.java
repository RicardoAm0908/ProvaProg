class Video extends File implements Resizable {
	private int height;
	private int width;

	public Video(int width, int height) {
		this.height = height;
		this.width = width;
	}

	public void setWidth(int w) {
		this.width = w;
	}

	public void getHeight(int h) {
		this.height = h;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

}
