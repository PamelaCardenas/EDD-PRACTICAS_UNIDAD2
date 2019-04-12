/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karla Pamela Cardenas Leyva 18550338
 */
public class Nodo {
    
    private int valor;
    private Nodo siguiente;
    private Nodo previo;

    public Nodo() {
        siguiente = null;
        previo = null;
    }

    
    public Nodo(int valor) {
        this.valor = valor;
        siguiente = null;
        previo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
    
    
    
    
}
