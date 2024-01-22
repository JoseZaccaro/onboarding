package day_2.pojo;

import day_2.pojo.Pet;
import day_2.pojo.herencia.Auto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      /*  System.out.println("Hola cohort 53");

        Pet pet = new Pet("Nila");
        Pet pet1 = new Pet("Batman");


*//*        System.out.println("Antes de modificar");
        System.out.println(pet);

        pet.setName("Nila");
        pet1.setName("Batman");*//*

        System.out.println(pet1.getName());

//        System.out.println("Despues de modificar");
        System.out.println(pet);*/


//        Control+/
        /*
        Control+Shift+/
         */



//        Scanner scanner = new Scanner(System.in);


        Object auto = new Auto(180,"Fiat","Uno", 5, true);
        Object pet = new Pet("Batman");


    }

}
