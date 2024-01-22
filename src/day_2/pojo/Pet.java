package day_2.pojo;

//Una clase es un molde o plantilla para generar objetos
public class Pet {

    //Propiedades // Atributos // Caracteristicas

    // public = Permite el acceso desde cualquier lugar de la app
    // default = Permite el acceso desde el mismo package
    // protected = Permitir el acceso desde el mismo package y desde clases hijas
    // private = Permite el acceso desde la misma clase

    //Encapsulamiento = Agrupar propiedades y comportamientos (metodos) en un objeto
    // Todas las propiedades tienen que estar en private
    private String name; //null

    private int age = 10; //0

    //Constructores

    public Pet(String name) {
        this.name = name;
    }


    //Metodos // Comportamientos

    // Metodos accesores
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Polimorfismo de sobrecarga de metodos o en tiempo de compilacion o estatico
    public void saludar(){
        System.out.println("Hola como estas?");
    }

    public void saludar(String nombre){
        System.out.println("Hola "+ nombre + " como estas?");
    }

//  Polimorfismo de sobreescritura o en tiempo de ejecucion o dinamico
    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
