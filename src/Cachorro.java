public class Cachorro extends Animal implements AnimalEstimacao, AnimalAdestrado { //interfaces são implementadas e não extendidas
    // para implementar mais interfaces separar por virgula
    @Override
    public void alimentar() { //implementado da interface AnimalEstimacao
        System.out.println("Comendo ração canina");
    }

    @Override
    public void passear() { // implementado da interface AnimalEstimação
        System.out.println("Andando");
    }

    @Override //vindo da classe Animal
    public void emitirSom() {
        System.out.println("Latindo");
    }

    @Override
    public void sentar() { // implementado da interface AnimalAAdestrado

    }

    @Override
    public void darAPata() { //implementado da interface AnimalAAdestrado

    }

    @Override
    public void deitar() { //implementado da interface AnimalAAdestrado

    }
}
