/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karla Pamela Cardenas Leyva 18550338
 */
public class Double_QS {
    
    //Push agregar un nodo en la cima de la pila
    //Peek lee el valor del nodo en la cima
    //Pop lee y elimina el nodo en la cima
    
    //Lista doble
         //queue --> lista enlazada EVA2_6_QUEUE_SIMPLE
         //queue, stack --> lista doblemente enlazada EVA2_7_QUEUE_STACK_DOUBLE
    
    //Por herencia
        //agregar stack
            //push, peek, pop
        //agregar queue
            //add --> agregar nodo al final
            //get --> leer nodo al inicio
            //getRemove --> leer nodo al inicio y eliminarlo
    
    
    private Nodo inicio;
    private Nodo fin;
    private int iContNodo;

    public Double_QS() {
        inicio = null;
        fin = null;
        iContNodo = 0;
    }
    
    public void agregarNodo(Nodo nNuevo){
        //LISTA INICIO
        if(inicio == null){
            inicio = nNuevo;
            fin = nNuevo;
            iContNodo++;
        }
        else{//HAY ELEMENTOS
            //CONECTAR CON EL FINAL DE LA LISTA+
            fin.setSiguiente(nNuevo);
            nNuevo.setPrevio(fin);
            fin = nNuevo;
            iContNodo++;
        }
    }
    
    //EFICIENCIA O(N)
    public void imprimir(){
        //LLEVAR AL FINAL DE LA LISTA
        Nodo nTemp = inicio;
            while(nTemp != null){
                System.out.print("[" + nTemp.getValor()+ "]");
                nTemp = nTemp.getSiguiente();
            }
            System.out.println("");
    }
    
    //EFICIENCIA O(N)
    public void imprimirOrdenInverso(){
        
         Nodo nTemp = fin;
            while(nTemp != null){
                System.out.print("[" + nTemp.getValor()+ "]");
                nTemp = nTemp.getPrevio();
            }
            System.out.println("");
    }
    
    //EFICIENCIA OH O(1)
    public int longitud(){
        return iContNodo;
    }
    
    //EFICIENICA O(1)
    public void vaciar(){
        inicio = null;
        fin = null;
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
                
                if(iVal == nTemp.getValor()){
                    iPos = iCont;
                    break;
                }
                
                iCont++;
                nTemp = nTemp.getSiguiente();
        }
        return iPos;
    }
    
    //EFICACIA O(1)
   public void agregarInicio(Nodo nNuevo){
       //Verificar estado de la lista
       //Esta vacia?
       if(inicio == null){
           inicio = nNuevo;
           fin = nNuevo;
           iContNodo++;
       }
       else{
           nNuevo.setSiguiente(inicio);
           inicio.setPrevio(nNuevo);
           inicio = nNuevo;
           iContNodo++;
       }
       
   }
   
   //EFICACIA O(N)
   public void agregarEn(int iPos, Nodo nNuevo){
       
      //VALIDAR:
       /*
       1. DEBE HABER NODOS, POR TANTO IPOS DEBE ESTAR EN EL RANGO DE 0 --> N-1
       2. SI INCERTO EN 0, ES AGREGAR AL INICIO
       3. EN TODOS LOS DEMAS CASOS HAY QUE RECONECTAR
       */
       
       if(iPos == 0){
           agregarInicio(nNuevo);
       }
       else{
           if(inicio == null){
               System.out.println("Posicion no valida, no hay elementos en la lista");
           }
           else{
               Nodo nTemp = inicio;
               int iCont = 0;
               while(iCont != iPos){
                   iCont++;
                   nTemp = nTemp.getSiguiente();
               }
               nNuevo.setSiguiente(nTemp);
               nTemp.getPrevio().setSiguiente(nNuevo);
               nNuevo.setPrevio(nTemp.getPrevio());
               nTemp.setPrevio(nNuevo);
               iContNodo++;

                //EL PROBLEMA ES EL NODO FIN
                if(nTemp.getSiguiente() == null){
                    fin = nTemp;
                }
                iContNodo++;
           }
           
       }
   }
   
  public void borrarNodo(int iPos) throws Exception{
        //BORRAR AL INICIO DE LA LISTA
        //BORRAR CUALQUIER POSICION
        //VERIFICAR QUE HAYA NODOS
        //VERIFICAR QUE LA POSICION SEA VALIDA
        if(inicio != null){
            if(iPos == 0){ //nodo inicial
                
                //HAY UN NODO
                //HAY N NODOS
                inicio = inicio.getSiguiente();
                inicio.setPrevio(null);
                //EL PROBLEMA ES EL NODO FIN
                if(inicio.getSiguiente()== null){
                    fin = null;
                }
            }
            else{
                //MOVERNOS EN LA LISTA
                //EN UNA LISTA SIMPLE (UN SOLO ENLACE)
                //IMPLICA MOVERNOS HASTA LA POSICION -1
                //--> nTemp  --> Nodo a borrar --> Nodo Sig
                Nodo nTemp = inicio;
                int iCont=0;
                while(iCont != iPos){
                    iCont++;
                    nTemp = nTemp.getSiguiente();
                }  
                nTemp.getPrevio().setSiguiente(nTemp.getSiguiente());
                nTemp.getSiguiente().setPrevio(nTemp.getPrevio());
                //EL PROBLEMA ES EL NODO FIN
                if(nTemp.getSiguiente()== null){
                    fin = nTemp;
                }
                iContNodo--;
            }
        }else{
            //GENERAR UNA EXEPCION --> LISTA VACIA
            throw new Exception("No se pueden borrar elementos, la lista esta vacia");
            
        }
    }
  
  public int getDato(int iPos){
        int iVal = 0;
        int iCont = 0;
        Nodo nTemp = inicio;
        
            while(nTemp != null){
                
                if(iCont == iPos){
                    iVal = nTemp.getValor();
                    break;
                }
                nTemp = nTemp.getSiguiente();
                iCont++;
            }
            return iVal;
    }
  
   //EFICIENCIA O(N)
    public Double_QS copiaLista(){
        Double_QS lsCopia = new Double_QS();
        
        //HAY QUE RECORRER TODA LA LISTA, LEER CADA NODO
        //CREAR UN NUEVO NODO PARA ESE VALOR
        //INSERTARLO EN LA NUEVA LISTA
        Nodo nTemp = inicio;
            while(nTemp != null){
                lsCopia.agregarNodo(new Nodo(nTemp.getValor()));
                nTemp = nTemp.getSiguiente();
            }
            
        return lsCopia;
    }
    
    //DONDE SE COLOCA EL NODO?
    public void push(Nodo nNuevo){
        agregarInicio(nNuevo);
    }
    
    public int peek() throws Exception{
        int iResu = 0;
        if(inicio != null){
            iResu = inicio.getValor();
        }
        else{
            //NOTIFICAR QUE NO HAY NODOS
            throw new Exception("No hay elementos en la lista");
        }
        return iResu;
    }
    
    public int pop() throws Exception{
        int iResu = 0;
        
        if(inicio != null){
            iResu = inicio.getValor();
            //Remover el nodo inicial
            borrarNodo(0);
        }
        else{
            //NOTIFICAR QUE NO HAY NODOS
            throw new Exception("No hay elementos en la lista");
        }
        return iResu;
    }
    
    public void add(Nodo nNuevo){
        agregarNodo(nNuevo);
    }
    
    public int get() throws Exception{
        int iResu = 0;
        
        if(inicio != null){
            iResu = inicio.getValor();
        }
        
        else{
            //NOTIFICAR QUE NO HAY NODOS
            throw new Exception("No hay elementos en la lista");
        }
        
        return iResu;
    }
    
    public int getRemove() throws Exception{
        int iResu = 0;
        
        if(inicio != null){
            iResu = inicio.getValor();
        }
        
        else{
            //NOTIFICAR QUE NO HAY NODOS
            throw new Exception("No hay elementos en la lista");
        }
        borrarNodo(0);
        
        return iResu;
    }
}
