/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        
        MiStack msPila = new MiStack();
        
        msPila.push(new Nodo (100));
        msPila.push(new Nodo (200));
        msPila.push(new Nodo (300));
        msPila.push(new Nodo (400));
        msPila.push(new Nodo (500));
        
        System.out.println("Hay " + msPila.longitud() + " nodos");
        
        msPila.imprimir();
        
        System.out.println("Valor en la cima " + msPila.peek());
        System.out.println("Valor en la cima " + msPila.pop());
        
        msPila.imprimir();
        
        System.out.println("Valor en la cima " + msPila.peek());
    }
    
}
