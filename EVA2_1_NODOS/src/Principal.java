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
        Nodo nObj1 = new Nodo();
        nObj1.iVal = 100;
        nObj1.nSig = null;
        
        Nodo nObj2 = new Nodo();
        nObj2.iVal = 200;
        nObj2.nSig = null;
        
        Nodo nObj3 = new Nodo();
        nObj3.iVal = 300;
        nObj3.nSig = null;
        
        //Vincular los Nodos y crear una lista
        
        nObj1.nSig = nObj2;
        nObj2.nSig = nObj3;
        
        Nodo nTemp = nObj1;
        
        while(nTemp != null){
            System.out.println("iVal = " + nTemp.iVal);
            nTemp = nTemp.nSig;
        }
    }
    
}

//ESLABON DE LA CADENA
class Nodo{
    //DATOS A ALMACENAR
    public int iVal;
    
    //REFERENCIA PARA CREAR LA CADENA
    //PUEDE HABER MULTIPLES REFRENECIAS
    public Nodo nSig;
}