import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IphoneFactory fabrica = new ConcreteIphoneFactory();


        HashMap<Integer, TypeIphoneEnum> retorno = new HashMap<>();

        retorno.put(1, TypeIphoneEnum.IPHONE_X);
        retorno.put(2, TypeIphoneEnum.IPHONE_9);
        retorno.put(3, TypeIphoneEnum.IPHONE_13_MINI);

        int escolha = scanner.nextInt();

        fabrica.getIphone(retorno.get(escolha)).exibirDetalhes();

    //    for (TypeIphoneEnum enumerate: TypeIphoneEnum.values()) {
        //       fabrica.getIphone(enumerate).exibirDetalhes();
     //   }
    }
}