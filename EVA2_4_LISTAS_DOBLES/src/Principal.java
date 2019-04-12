
import java.util.Scanner;

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
        ListaDoble lstLista = new ListaDoble();
        
        for (int i = 0; i < 10; i++) {
            int iVal = (int)(Math.random() * 100);
            lstLista.agregarNodo(new Nodo(iVal));
            
        }
        
        lstLista.imprimir();
        lstLista.imprimirOrdenInverso();
        Scanner sInput = new Scanner (System.in);
        System.out.println("Valor a buscar: ");
        int iVal = sInput.nextInt();
        sInput.nextLine();
        
        System.out.println("La posicion es " + lstLista.buscar(iVal));
        
        lstLista.agregarInicio(new Nodo(999));
        lstLista.imprimir();
        
        lstLista.agregarEn(1, new Nodo(250));
        lstLista.imprimir();
        
        System.out.println("Posicion a borrar");
        int iPos = sInput.nextInt();
        lstLista.borrarNodo(iPos);
        lstLista.imprimir();
        
        System.out.println("Posicion a buscar");
        iPos = sInput.nextInt();
        System.out.println("El valor es: " + lstLista.getDato(iPos));
        
        
        
    }
    
}
