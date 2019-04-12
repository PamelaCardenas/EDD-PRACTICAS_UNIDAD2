/*
 * 
 */

/**
 *
 * @author Karla Pamela Cardenas Leyva 18550338
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaInicio lstMiLista = new ListaInicio();
        
        lstMiLista.agregarNodo(new Nodo(100));
        lstMiLista.agregarNodo(new Nodo(200));
        lstMiLista.agregarNodo(new Nodo(300));
        lstMiLista.agregarNodo(new Nodo(400));
        lstMiLista.agregarNodo(new Nodo(500));
        lstMiLista.agregarNodo(new Nodo(600));
        lstMiLista.agregarNodo(new Nodo(700));
        lstMiLista.agregarNodo(new Nodo(800));
        lstMiLista.agregarNodo(new Nodo(900));
        lstMiLista.agregarNodo(new Nodo(1000));
        
        lstMiLista.imprimir();
        
        
    }
    
}
