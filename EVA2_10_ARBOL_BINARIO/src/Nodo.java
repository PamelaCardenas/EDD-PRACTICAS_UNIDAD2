/*
 * 
 */

/**
 *
 * @author Karla Pamela Cardenas Leyva 18550338
 */
public class Nodo {
    
    private int valor;
    private Nodo izq;
    private Nodo der;

    public Nodo() {
        izq = null;
        der = null;
    }

    public Nodo(int iVal) {
        valor = iVal;
        this.izq = izq;
        this.der = der;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
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
