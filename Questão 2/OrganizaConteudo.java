class OrganizaConteudo {
    public static void removeRotacoes(File[] elements) {
		for (int b = 0; b < elements.length; b++) {
			if (elements[b] instanceof Rotatable){
				((Rotatable)elements[b]).setRotation(0);
			}
		}
    }
    public static void economizaTamanho(File[] elements) {
        for (int b = 0; b < elements.length; b++) {
			if (elements[i] instanceof Resizable){
				((Resizable)elements[b]).setHeight(200);
				((Resizable)elements[b]).setWidth(200);
			}
		}
    }
}
