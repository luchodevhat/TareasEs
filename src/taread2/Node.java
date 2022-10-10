
package taread2;


public class Node {
    private Trastos valor;
    private Node siguiente;
    
    //constructor para inicializar

    public Node() {
        this.valor = null;
        this.siguiente = null;
    }

    public Trastos getValor() {
        return valor;
    }

    public void setValor(Trastos valor) {
        this.valor = valor;
    }

    public Node getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Node{" + "valor=" + valor + '}';
    }
}
