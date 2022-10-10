package Tarea3;

public class Nodo {
    private Cliente dato;
    private Nodo atras;

    public Nodo(Cliente dato) {
        this.dato = dato;
    }

    public Cliente getDato() {
        return dato;
    }

    public void setDato(Cliente dato) {
        this.dato = dato;
    }
    
    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
}

