/*
 * 
 */

/**
 *
 * @author Karla Pamela Cardenas Leyva 18550338
 */
public class Listas {
    //INICIO DE LA LISTA
    private Nodo inicio;
    private Nodo fin;
    private int iContNodos = 0;

    //AL CREAR LA LISTA, INICIA CON CERO ELEMENTOS
    //LISTA VACIA
    //3 ESTADOS: VACIA, CON UN NODO, CON N NODOS
    public Listas() {
        inicio = null;
        fin = null;
    }
    
    //PRIMER METODO: AGREGAR UN NODO
    //EFICIENCIA O(N) --> Sin NODO fin
    //EFICIENCIA O(1) --> Con NODO fin
    //METODO QUE RECIBA UN NODO
    public void agregarNodo(Nodo nNuevo){
        //VERIFICAR EL ESTADO DE LA LISTA
        //ESTA VACIA?
        if(inicio == null){
            inicio = nNuevo;
            fin = nNuevo; //MODIFICADO --> EFICIENCIA
        }
        //LISTA CON UN NODO
        else{
            //LLEVAR nTemp AL FINAL DE LA LISTA
            /*Nodo nTemp = inicio;
            while(nTemp.getSig() != null){
                nTemp = nTemp.getSig();
                
            }
            //CONECTAMOS NTEMP.SG --> NUEVO
            nTemp.setSig(nNuevo);
                    */
            fin.setSig(nNuevo);
            fin = nNuevo;
            iContNodos++;
            
            
        }
        //LISTA CON N NODOS
        
        
    }
    //EFICACIA O(1)
   public void agregarInicio(Nodo nNuevo){
       //Verificar estado de la lista
       //Esta vacia?
       if(inicio == null){ //LISTA VACIA
           inicio = nNuevo;
           fin = nNuevo;
           iContNodos++;
       }
       else{//LISTA CON N NODOS
           nNuevo.setSig(inicio);
           inicio = nNuevo;
           iContNodos++;
       }
       
   }
   
   //EFICACIA O(N)
   public void agregarEn(int iPos, Nodo nNuevo){
       //posicion valida (dentro del indice de la lista)
       //SI HAY NODOS O NO EN LA LISTA
       //INSERTAR AL INICIO (pos=0)
       if(iPos == 0 ){
           agregarInicio(nNuevo);
       }
       else{
        //INSERTAR EN CUALQUIER POSICION
        //VALIDAR SI LA LISTA ESTA VACIA
            if(inicio == null){
                inicio = nNuevo;
                fin = nNuevo;
            }
            else{
                 Nodo nTemp = inicio;
                int iPosA=0;
                while(iPosA != iPos-1){
                    iPosA++;
                    nTemp = nTemp.getSig();
                }  
                nNuevo.setSig(nTemp.getSig());
                nTemp.setSig(nNuevo);
                
                //EL PROBLEMA ES EL NODO FIN
                if(nTemp.getSig() == null){
                    fin = nTemp;
                }
                iContNodos++;
                
            }
           
       }
       
   }
    //EFICACIA O(N)
    public void borrarNodo(int iPos) throws Exception{
        //BORRAR AL INICIO DE LA LISTA
        //BORRAR CUALQUIER POSICION
        //VERIFICAR QUE HAYA NODOS
        //VERIFICAR QUE LA POSICION SEA VALIDA
        if(inicio != null){
            if(iPos == 0){ //nodo inicial
                
                //HAY UN NODO
                //HAY N NODOS
                inicio = inicio.getSig();
                //EL PROBLEMA ES EL NODO FIN
                if(inicio.getSig() == null){
                    fin = null;
                }
            }
            else{
                //MOVERNOS EN LA LISTA
                //EN UNA LISTA SIMPLE (UN SOLO ENLACE)
                //IMPLICA MOVERNOS HASTA LA POSICION -1
                //--> nTemp  --> Nodo a borrar --> Nodo Sig
                Nodo nTemp = inicio;
                int iPosA=0;
                while(iPosA != iPos-1){
                    iPosA++;
                    nTemp = nTemp.getSig();
                }  
                Nodo nSig = nTemp.getSig();
                nTemp.setSig(nSig.getSig());
                //EL PROBLEMA ES EL NODO FIN
                if(nTemp.getSig() == null){
                    fin = nTemp;
                }
                iContNodos--;
            }
        }else{
            //GENERAR UNA EXEPCION --> LISTA VACIA
            throw new Exception("No se pueden borrar elementos, la lista esta vacia");
            
        }
    }
    
    //EFICIENCIA O(N)
    public void imprimir(){
        //LLEVAR AL FINAL DE LA LISTA
        Nodo nTemp = inicio;
            while(nTemp != null){
                System.out.print("[" + nTemp.getDato() + "]");
                nTemp = nTemp.getSig();
            }
            System.out.println("");
    }
    
    //EFICIENCIA O(N)
    public int longitud(){
        /*Nodo nTemp = inicio;
        int cont=0;
            while(nTemp != null){
                cont++;
                nTemp = nTemp.getSig();
            }*/
        
            return iContNodos;
    }
    
    //EFICIENICA O(1)
    public void vaciar(){
        inicio = null;
        fin = null;
    }
    
    //LISTAS MANEJAN INDICES COMO ARREGLOS
    //PRIMER NODO --> 0
    //ULTIMO NODO --> N-1
    //EFICIENCIA O(N)
    
    //AGREGAR CONDICIONES.
    /*
    LISTA VACIA
    PARAMETRO INCORRECTO(iPos no este entre 0 y N-1)
    Excepciones --> throw
    */
    public int getValor(int iPos){
        int iVal = 0;
        int iCont = 0;
        Nodo nTemp = inicio;
        
            while(nTemp != null){
                
                if(iCont == iPos){
                    iVal = nTemp.getDato();
                    break;
                }
                nTemp = nTemp.getSig();
                iCont++;
            }
            return iVal;
    }
    //EFICIENCIA O(1)
    public boolean estaVacia(){
        if(inicio == null){
            return true;
        }
        else{
            return false;
        }
    }
    
    //EFICIENICA O(N)
    public int buscar(int iVal){
        int iPos = -1;
        //COMO BUSCAMOS EL VALOR
        //RECORRER ELEMENTO POR ELEMENTO
        //DETENER LA BUSQUEDA CUANDO SE ENCUENTRE
        //SE PUEDE LLEGAR AL FINAL DE LA LISTA SIN ENCONTRARLO
        int iCont = 0;
        Nodo nTemp = inicio;
        while(nTemp != null){
            
                //DETENER EL CICLO CUANDO LO ENCONTREMOS
                
                if(iVal == nTemp.getDato()){
                    iPos = iCont;
                    break;
                }
                
                iCont++;
                nTemp = nTemp.getSig();
        }
        return iPos;
    }
    //EFICIENCIA O(N)
    public Listas copiaLista(){
        Listas lsCopia = new Listas();
        
        //HAY QUE RECORRER TODA LA LISTA, LEER CADA NODO
        //CREAR UN NUEVO NODO PARA ESE VALOR
        //INSERTARLO EN LA NUEVA LISTA
        Nodo nTemp = inicio;
            while(nTemp != null){
                lsCopia.agregarNodo(new Nodo(nTemp.getDato()));
                nTemp = nTemp.getSig();
            }
            
        return lsCopia;
    }
    //EFICIENCIA O(N^2)
    public void imprimirOrdenInverso(){
        int iCont = longitud()-1;
        
        while(iCont != -1){
            int iPos = iCont;
          System.out.print("[" + getValor(iPos) + "]");  
            getValor(iPos);
            iCont--;
        }
        
        
    }
}
