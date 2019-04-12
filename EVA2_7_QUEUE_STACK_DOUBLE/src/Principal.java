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
        
        Double_QS sStack = new Double_QS();
        
        sStack.push(new Nodo(100));
        sStack.push(new Nodo(200));
        sStack.push(new Nodo(300));
        sStack.push(new Nodo(400));
        sStack.push(new Nodo(500));
        
        sStack.imprimir();
        
        System.out.println("Valor en el inicio " + sStack.peek());
        System.out.println("Valor en el inicio a remover " + sStack.pop());
        
        sStack.imprimir();
        
        System.out.println("");
        
        Double_QS qQueue = new Double_QS();
        
        qQueue.add(new Nodo(900));
        qQueue.add(new Nodo(800));
        qQueue.add(new Nodo(700));
        qQueue.add(new Nodo(600));
        qQueue.add(new Nodo(500));
        
        qQueue.imprimir();
        
        System.out.println("Valor al inicio " + qQueue.get());
        System.out.println("Valor al inicio a remover " + qQueue.getRemove());
        
        qQueue.imprimir();
    }
    
}
