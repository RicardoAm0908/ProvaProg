class OrganizaConteudo {

    public static void removeRotacoes(File a){

        if(a instanceof Rotatable){
            ((Rotatable) a).setRotation(0);
        }

    };

    public static void economizaTamanho(File a){

        if( a instanceof Resizable){
            ((Resizable).a).setHeight(200);
            ((Resizable).a).setWidth(200);
        }




    };
}
