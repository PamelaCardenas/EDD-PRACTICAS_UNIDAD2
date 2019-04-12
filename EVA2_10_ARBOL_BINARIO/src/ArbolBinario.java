/*
 * 
 */

/**
 *
 * @author Karla Pamela Cardenas Leyva 18550338
 */
public class ArbolBinario {
    
    private Nodo root;

    public ArbolBinario() {
        root = null;
    }
    
    public void agregarNodo(Nodo nNuevo){
        if (root == null){ //ARBOL VACIO, SE INSERTA
            root = nNuevo;
        }
        else{ //PROCESO RECURSIVO
            agregarRecursivo(root, nNuevo);
        }
    }
                                  //NODO ACTUAL, VALOR A INSERTAR
    private void agregarRecursivo(Nodo nActual, Nodo nNuevo){
        //MENOR --> IZQUIERDA
        if(nNuevo.getValor() < nActual.getValor()){
            
            if(nActual.getIzq() != null){
                
                agregarRecursivo(nActual.getIzq(), nNuevo);
                
            }else{
                nActual.setIzq(nNuevo);
            }
            
        }//MAYOR --> DERECHA
        else if(nNuevo.getValor() > nActual.getValor()){
            
            if(nActual.getDer() != null){
                
                agregarRecursivo(nActual.getDer(), nNuevo);
                
            }else{
                nActual.setDer(nNuevo);
            }
            
        }//IGUAL --> MENSAJE AL USUARIO
        else{
            //MENSAJE
            System.out.println("El valor ya existe");
            //LANZAR UNA EXCEPCION
            
        }
    }
    
    public void imprimirInOrder(){
        inOrder(root);
    }
    
    private void inOrder(Nodo nActual){
        /*
            RECORRER IZQUIERDA
            LEER EL VALOR
            RECORRER DERECHA
        */
        if(nActual != null){
            inOrder(nActual.getIzq());
            System.out.print("[" + nActual.getValor() + "]");
            inOrder(nActual.getDer());
        }
    }
    
    public void imprimirPosOrden(){
        posOrden(root);
    }
    private void posOrden(Nodo nActual){
        //RECORRER IZQUIERDA
        //RECORRER DERECHA
        //LEER
        if(nActual != null){
            posOrden(nActual.getIzq());
            posOrden(nActual.getDer());
            System.out.print("[" + nActual.getValor() + "]");
        }
    }
    
    public void imprimirPreOrden(){
        preOrden(root);
    }
    private void preOrden(Nodo nActual){
        //LEER EL VALOR
        //RECORRER IZQUIERDA
        //RECORRER DERECHA
        if(nActual != null){
            System.out.print("[" + nActual.getValor() + "]");
            preOrden(nActual.getIzq());
            preOrden(nActual.getDer());
        }
    }
}
