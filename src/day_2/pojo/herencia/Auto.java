package day_2.pojo.herencia;

public class Auto extends Vehiculo{

    private int cantidadPuertas;

    private Boolean aleron;

    public Auto(int velMax, String marca, String modelo, int cantidadPuertas, Boolean aleron) {
        super(velMax, marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
        this.aleron = aleron;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public Boolean getAleron() {
        return aleron;
    }

    public void setAleron(Boolean aleron) {
        this.aleron = aleron;
    }

    @Override
    public void acelerar() {
        System.out.println("El auto esta acelerando");
    }
}
