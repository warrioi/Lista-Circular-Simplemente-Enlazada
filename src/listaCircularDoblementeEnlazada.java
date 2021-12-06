public class listaCircularDoblementeEnlazada {
    Nodo inicio;

    public listaCircularDoblementeEnlazada(){
        inicio = null;
    }
    public boolean estaVacia(){
        return inicio == null;
    }

    public void insertar(Object dato){
        if (estaVacia()){
            Nodo nuevo = new Nodo(dato,null,null);
            inicio=nuevo;
        }else{
            Nodo nuevo =new Nodo(dato,inicio,null);
            inicio.setAnterior(nuevo);
            inicio=nuevo;
        }
    }

    public void eliminar(){

        if (!estaVacia()){
            inicio = inicio.getSiguiente();
        }
    }

    public void mostrarC(){

        Nodo aux = inicio;
        while (aux !=null){
            System.out.print(aux.getDato() +" ");
            aux = aux.getSiguiente();
        }

        if (!estaVacia()){
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente()!=null){
                ultimo= ultimo.getSiguiente();
            }
            Nodo temp= ultimo;
            while (temp!=null){
                System.out.print(temp.getDato()+ " ");
                temp= temp.getAnterior();
            }
            System.out.println("");
        }
    }

}
