
import java.awt.Point;

/*
 * 
 */

/**
 *
 * @author Karla Pamela Cardenas Leyva 18550338
 */
public class Nodo {
    //ATRIBUTOS DATOS
    private Point dato;
    //ATRIBUTO PARA CREAR LA LISTA (REFERENCIAS)
    private Nodo sig;

    public Nodo() {
        this.sig = null;
    }
  

    public Nodo(Point dato) {
        this.dato = dato;
    }

    public Point getDato() {
        return dato;
    }

    public void setDato(Point dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
    
    
    
}
