public class ConcreteIphoneFactory extends IphoneFactory{

    @Override
    public Iphone getIphone(TypeIphoneEnum valorEscolhido) {
        Iphone iphone = null;
        switch(valorEscolhido){
            case IPHONE_X-> {
                 iphone = new IphoneX();
            }
            case IPHONE_9 -> {
                 iphone = new Iphone9();
            }
            case IPHONE_13_MINI -> {
                 iphone = new Iphone13Mini();
            }
        }
        return iphone;
    }
}

