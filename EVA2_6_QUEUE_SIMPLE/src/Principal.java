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
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Queue qFila = new Queue();
        
        qFila.add(new Nodo(900));
        qFila.add(new Nodo(800));
        qFila.add(new Nodo(700));
        qFila.add(new Nodo(600));
        qFila.add(new Nodo(500));
        
        qFila.imprimir();
        
        System.out.println("Valor al inicio " + qFila.get());
        
        System.out.println("Valor al inicio " + qFila.getRemove());
        
        qFila.imprimir();
        
        System.out.println("Valor la incio " + qFila.get());
    }
    
}
