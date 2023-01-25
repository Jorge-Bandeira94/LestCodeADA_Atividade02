public enum TypeIphoneEnum {

    IPHONE_X(1), IPHONE_9(2), IPHONE_13_MINI(3);

    int valor;
    TypeIphoneEnum(int valorOpcao) {
        valor = valorOpcao;
    }

    public int getValor(){
        return valor;
    }



}
