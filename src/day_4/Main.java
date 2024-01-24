package day_4;

public class Main {

    public static void main(String[] args) {

        Avion avion = new Avion();
        Pajaro pajaro = new Pajaro();

        avion.volando();
        pajaro.volando();
        avion.abordajePasajeros();

//        Mensajes mensaje = new MensajesImpl();
//
//        mensaje.saludo("Martin");

        Person person = new Person();

        person.getMensajes().saludo("Guille");
    }
}
