public class Nodo {
    private int dato;
    private Nodo izq;
    private Nodo der;

    public Nodo(int dato) {
        this.dato = dato;
        this.izq = null;
        this.der = null;
    }

    public int getDato() {
        return dato;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
}
