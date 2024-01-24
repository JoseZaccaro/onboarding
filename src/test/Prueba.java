package test;

import java.util.Scanner;

public class Prueba {

    private Menu menu = new MenuImpl();

    private Scanner scanner = new Scanner(System.in);

    private void mostrarOpciones(){
        menu.desplegarMenu();
    }

    private void opcionSeleccionada(){
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Usted selecciono la opcion 1");
                break;
            case 2:
                System.out.println("Usted selecciono la opcion 2");
                break;
            default:
                System.out.println("Usted no selecciono nada");
        }
    }

    public boolean init(){
        mostrarOpciones();
        System.out.println("Ingrese un numero por favor");
        opcionSeleccionada();
        return false;
    }


}
