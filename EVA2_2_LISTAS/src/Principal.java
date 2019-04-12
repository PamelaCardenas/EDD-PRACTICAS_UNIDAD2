
import java.util.Scanner;

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
        Listas lstMiLista = new Listas();
        int[] aiDatos = new int[1000000];
        
        /*lstMiLista.agregarNodo(new Nodo(100));
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
        lstMiLista.borrarNodo(10);
        lstMiLista.imprimir();
        
        System.out.println("En la lista hay: " + lstMiLista.longitud());*/
        
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random() * 1000);
            
        }
        System.out.println("Eso fue rapido");
        
        for (int i = 0; i < 10; i++) {
            int iVal = (int)(Math.random() * 1000);
            lstMiLista.agregarNodo(new Nodo (iVal));
            
        }
        System.out.println("Tambien fue rapido");
        
        lstMiLista.imprimir();
        lstMiLista.borrarNodo(0);
        lstMiLista.imprimir();
        lstMiLista.agregarNodo(new Nodo(999));
        lstMiLista.imprimir();
        lstMiLista.borrarNodo(9);
        lstMiLista.imprimir();
        
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Valor a buscar: ");
        
        int iValBus = sCaptu.nextInt();
        sCaptu.nextLine();
        
        System.out.println("El valor " + iValBus + " esta en la posicion " + lstMiLista.buscar(iValBus));
        
        Listas lstCopia = lstMiLista.copiaLista();
        lstCopia.imprimir();
        lstCopia.agregarNodo(new Nodo(5000));
        lstCopia.imprimir();
        lstMiLista.imprimir();
        lstMiLista.imprimirOrdenInverso();
        
        System.out.println("Longitud " + lstMiLista.longitud());
        lstMiLista.agregarEn(8, new Nodo(900));
        lstMiLista.imprimir();
    }
    
}
