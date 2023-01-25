public interface AnimalAdestrado extends AnimalEstimacao { //uma interface não pode implementar outra interface, mas pode extender de uma interface pois pode herdar
    // se cachorro não tivesse implementado aniamlEstimação, por esta interface aqui extender de AnimalEstimação, cachorro seria obrigado a implementar os métodos de AnimalEstimação
    void sentar();
    void darAPata();
    void deitar();
}
