package day_3;

import static day_3.TipoCompu.*;

public class Main {

    public static void main(String[] args) {

        Computadora compu = new Computadora(ESCRITORIO);

        Memoria ram1 = new Memoria(4,2700,"Genius", GeneracionMem.DDR3);
        Memoria ram2 = new Memoria(8,2700,"Genius", GeneracionMem.DDR3);

        compu.addMemorias(ram1);
        compu.addMemorias(ram2);
        compu.addMemorias(ram1);

        // Computadora memorias Compu Memoria Compu
//        System.out.println(compu);

        String name = "Martin";
        String name2 = new String("Martin");
        System.out.println(name == name2);


//      TIPO_COMPU
//      TipoCompu

//        Collection
//        List = Lista ordenada de elementos.
//        Set = No admite duplicados. No tiene orden.

         ; //null
      /*  Set<Integer> numeros2 = new HashSet<>();



        numeros2.add(2);
        numeros2.add(4);
        numeros2.add(6);
        numeros2.add(8);
        numeros2.add(10);


        List<Integer> numeros = List.of(2,4, 4 ,6,8 , 8, 10);

        Stream<Integer> preresultado = numeros.stream();

        Stream<Integer> preresultado2 = preresultado.map(element -> element * 2 );

        Set<Integer> resultado = preresultado2.collect(Collectors.toSet());

        System.out.println(resultado);*/

//        List<String> mentores = List.of("Guille", "Jose", "Nico", "Martin");
    }

}
