class Word extends File implements Rotatable {

    private String word;
	private boolean bold;
	private boolean italic;
	private boolean underlined;
	private int rotation;

	public Word(String word) {
		this.word = word;
		this.rotation = 0;
		this.bold = false;
		this.italic = false;
		this.underlined = false;
	}


    public int getRotation() {
		return this.rotation;
	}

	public void setRotation(int r) {
		this.rotation = r;
	}

	public boolean getBold() {
		return this.bold;
	}

	public void setBold(boolean b) {
		this.bold = b;
	}

	public boolean getItalic() {
		return this.italic;
	}

	public void setItalic(boolean i) {
		this.italic = i;
	}

	public boolean getUnderlined() {
		return this.underlined;
	}

	public void setUnderlined(boolean u) {
		this.underlined = u;
	}

	public String getWord() {
		return this.word;
	}

	public void setWord(String w) {
		this.word = w;
	}



}
