package day_4;

public class Person {

    private Mensajes mensajes = new MensajesImpl();

    public Mensajes getMensajes() {
        return mensajes;
    }

    public void darSaludo(){
        mensajes.saludo("Jose");
    }
}
