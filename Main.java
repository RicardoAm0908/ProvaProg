import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		ArrayList<File> elements = new ArrayList<Objeto>();
		Word palavra = new Word("palavra");

		palavra.setItalic(true);
		elements.add(palavra);

		Image m = new Image(50, 30, 0);
		elements.add(m);

		Video video = new Video(120, 180);
		elements.add(video);

		int n = elements.size();
		File obj;
		for (int i = 0; i < n; i++) {
			obj = elements.get(i);
			if (obj instanceof Image) {
				((Image)obj).setRotacao(120);
			} else if (obj instanceof Word) {
				((Word)obj).setSublinhado(true);
			}
		}
	}
}
