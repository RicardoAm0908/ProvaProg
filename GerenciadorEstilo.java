class GerenciadorEstilo {
	public static void aplicaEstilo(String style, File fle) throws EPalavraPequena, EElementoIncompativel {
		if (!(fle instanceof Word)) {
			throw new EElementoIncompativel();
		} else if (((Word)fle).getWord().length() < 2) {
			throw new EPalavraPequena();
		}
		Word w = (Word)fle;
		if (style.equals("Bold")) {
			w.setBold(true);
		} else if (style.equals("Italic")) {
			w.setItalic(true);
		} else if (style.equals("Underlined")) {
			w.setUnderlined(true);
		}
	}
}
