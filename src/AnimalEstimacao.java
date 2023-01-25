public interface AnimalEstimacao { //a diferneça da interface para uma classe abstrata é que a classe abstrata esta ligada a herança, onde as classes
    // filhas recebem da classe pai. Os metodos da classe filha podem ser reescritos ou podem conter metodos e atributos específicos.
    // Um método abstrato numa classe obriga a classe que faz herança dela implementar aquele método tbm.
    // Métodos abstratos não tem corpo, só assinatura, o corpo ser´ra desenvolvido nas classes que serão extendida de seu proprio jeito
    // Um cachorro só pode extender de mamifero oud e animal, não tem como ser dos dois ao memso tempo, e estas classes não podem se misturar, aves podem ser estimação ams não mamiferos
    // Para solucionar isso usamos a interface. Uma interface é uma classe abstrata com métodos abstratos. Todos que extendem da interface são obrigados a implementar os métodos
    // dela tbm. Na interface, tudo que um animal de estimação tiver, tera sua asisnatura do método ali. Todas as classes que tiverem implementada a interface
    // farão seus proprios métodos a partir dos métodos da interface.
    // Vc pode implementar varias interfaces na mesma classe, mas só pode extender uma classe
    // Assim, podemos extender um classe e ao memso tempo implementar 1, 2 ou mais interfaces na mesma classe
    // A interface vai servir como um contrato das regras para quem implementa ela.

    void alimentar(); //interfaces não precisam definir o metodo como public e/ou abstrato
    void passear();
}
