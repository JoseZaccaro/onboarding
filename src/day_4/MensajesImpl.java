package day_4;

public class MensajesImpl implements Mensajes{


    @Override
    public void saludo(String nombre) {
        System.out.println("Hola "+ nombre +" como estas?" );
    }
}
