
//interfaces e classes abstratas
// quando fazemso exteds de classes abstratas precisamos implementar todos
// os métodos da classe mãe. Se uma classe abstrata Ave, extende de uma classe abstrata Animal
// a classe concreta cegonha precisara implementar os metodos de todas.
// A classe abstrata ave não necessita implementar os métodos da classe mãe animal pois tbm é abstrata

public class Calopsita extends Ave {

    @Override
    public void emitirSom() { //da classe animal

    }

    @Override
    public void voar() { //da classe ave

    }
}


