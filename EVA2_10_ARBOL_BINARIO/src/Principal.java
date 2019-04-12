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
        
        ArbolBinario abArbol = new ArbolBinario();
        
        abArbol.agregarNodo(new Nodo (13));
        abArbol.agregarNodo(new Nodo (10));
        abArbol.agregarNodo(new Nodo (18));
        abArbol.agregarNodo(new Nodo (2));
        abArbol.agregarNodo(new Nodo (11));
        abArbol.agregarNodo(new Nodo (17));
        abArbol.agregarNodo(new Nodo (20));
        abArbol.agregarNodo(new Nodo (16));
        abArbol.agregarNodo(new Nodo (20)); //Valor ya repetido
        
        //2 - 10 - 11 - 13 - 16 - 17 - 18 - 20  IN ORDER
        
        
        System.out.println("\nIn order");
        abArbol.imprimirInOrder();
        System.out.println("\nPos Orden");
        abArbol.imprimirPosOrden();
        System.out.println("\nPre Orden");
        abArbol.imprimirPreOrden();
        
    }
    
}
