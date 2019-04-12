/*
 * 
 */

/**
 *
 * @author Karla Pamela Cardenas Leyva 18550338
 */
public class Nodo {
    //ATRIBUTOS DATOS
    private int dato;
    //ATRIBUTO PARA CREAR LA LISTA (REFERENCIAS)
    private Nodo sig;

    public Nodo() {
        this.sig = null;
    }
  

    public Nodo(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
    
    
    
}
