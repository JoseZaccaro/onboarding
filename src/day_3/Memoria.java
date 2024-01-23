package day_3;

public class Memoria {

    private int capacidad, frecuencia;

    private String marca;

    private Computadora compu;

    private GeneracionMem gen;

    public Memoria(int capacidad, int frecuencia, String marca, GeneracionMem gen) {
        this.capacidad = capacidad;
        this.frecuencia = frecuencia;
        this.marca = marca;
        this.gen = gen;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public GeneracionMem getGen() {
        return gen;
    }

    public void setGen(GeneracionMem gen) {
        this.gen = gen;
    }

    public Computadora getCompu() {
        return compu;
    }

    public void setCompu(Computadora compu) {
        this.compu = compu;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidad=" + capacidad +
                ", frecuencia=" + frecuencia +
                ", marca='" + marca + '\'' +
                ", gen=" + gen +
                '}';
    }
}
