package day_2.pojo.herencia;

public class Vehiculo {

    // Herencia

    private int velMax;

    private String marca;

    private String modelo;

    // Herencia = Capacidad de una clase de heredar propiedades y metodos de una clase padre o super class.
    // Polimorfismo = Capacidad de compartir el mismo nombre, pero comportarse de forma diferente.
    // Encapsulamiento = Permite agrupar propiedades y metodos dentro de un objeto. Permite ocultar o proteger datos.
    // Abstraccion = Abstraer las caracteristicas principales del objeto que se quiere representar.

    public Vehiculo() {
    }

    public Vehiculo(int velMax, String marca, String modelo) {
        this.velMax = velMax;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("El vehiculo esta acelerando");
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "velMax=" + velMax +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
