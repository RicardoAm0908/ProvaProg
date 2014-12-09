class GerenciadorEstilo {
	public static void aplicaEstilo(String style, Objeto fle) throws EPalavraPequena, EElementoIncompativel {
		if (!(fle instanceof Word)) {
			throw new EElementoIncompativel();
		} else if (((Word)fle).getTexto().length() < 2) {
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
