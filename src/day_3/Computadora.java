package day_3;

import java.util.HashSet;
import java.util.Set;

public class Computadora {

    private TipoCompu tipo;

    // OneToMany
    // ManyToMany
    // OneToOne

    private Set<Memoria> memorias = new HashSet<>();

    public Computadora(TipoCompu tipo) {
        this.tipo = tipo;
    }

    public TipoCompu getTipo() {
        return tipo;
    }

    public void setTipo(TipoCompu tipo) {
        this.tipo = tipo;
    }

    public Set<Memoria> getMemorias() {
        return memorias;
    }

    public void addMemorias(Memoria memoria){

        memoria.setCompu(this);

        this.memorias.add(memoria);

    }

    @Override
    public String toString() {
        return "Computadora{" +
                "tipo=" + tipo +
                ", memorias=" + memorias +
                '}';
    }
}
