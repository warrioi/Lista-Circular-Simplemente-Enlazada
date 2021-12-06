public class Nodo {
    private Object dato;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(Object dato, Nodo siguiente, Nodo anterior) {
        this.setDato(dato);
        this.setSiguiente(siguiente);
        this.setAnterior(anterior);
    }


    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }


}
