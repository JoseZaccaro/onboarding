package day_4;

public class Avion implements Volador, Abordaje{



    @Override
    public void volando() {
        System.out.println("El avion esta volando");
    }

    @Override
    public void abordajePasajeros() {
        System.out.println("Los pasajeros estan abordando el avion");
    }
}
