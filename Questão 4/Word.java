//C�digo criado para a quest�o 4, pois n�o sabia se para a corre��o da quest�o 1 poderia existir os m�todos da quest�o 4!

class Word extends File implements Rotatable, Positionable {

    private String word;
	private boolean bold;
	private boolean italic;
	private boolean underlined;
	private int rotation;
	private int x;
	private int y;

	public Word(String word) {
		this.word = word;
		this.rotation = 0;
		this.bold = false;
		this.italic = false;
		this.underlined = false;
	}

	public void setX (int a){
        this.x = a;
    }

    public int getX{
        return this.x;
    }

    public void setY (int b){
        this.y = b;
    }


    public int getY{
        return this.y;
    }

    public void move (int a, int b){    //fun��o que altera a posi��o inteira do elemento, no caso, o X e Y.
        this.setX(a);
        this.setY(b);
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
