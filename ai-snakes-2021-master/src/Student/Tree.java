package Student;

public class Tree {

    Nodo raiz;
    public Tree(){
        raiz = null;
    }

    public void CalcularE(Nodo n){
        n.Exito = n.Victoria/ n.Derrota;
    }

    public void CrearNodo(){

    }
    private class Nodo{
        public Nodo Padre;
        public Nodo Izquierda;
        public Nodo Derecha;
        public int Victoria;
        public int Derrota;
        public float Exito;
        public Object Contenido;

        public Nodo(){
            Padre = null;
            Izquierda = null;
            Derecha = null;
            Victoria = 0;
            Derrota =  0;
            Exito = 0;
            Contenido = null;
        }
    }

}
