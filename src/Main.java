public class Main {
    public static void main(String[] args) {
        listaCircularDoblementeEnlazada lcde = new listaCircularDoblementeEnlazada();

        System.out.println(lcde.estaVacia());
        lcde.insertar(1);
        lcde.insertar(2);
        lcde.insertar(3);
        lcde.insertar(4);
        lcde.insertar(5);
        lcde.insertar(6);
        lcde.insertar(7);
        lcde.insertar(8);
        lcde.insertar(9);
        lcde.insertar(10);

        lcde.eliminar();
        lcde.insertar(13);
        lcde.insertar(19);


        for (int i = 0; i <5 ; i++) {
            lcde.mostrarC();
        }
    }
}
