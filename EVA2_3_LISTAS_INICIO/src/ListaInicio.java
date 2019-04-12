/*
 * 
 */

/**
 *
 * @author Karla Pamela Cardenas Leyva 18550338
 */
public class ListaInicio {
    private Nodo inicio;

    //AL CREAR LA LISTA, INICIA CON CERO ELEMENTOS
    //LISTA VACIA
    //3 ESTADOS: VACIA, CON UN NODO, CON N NODOS
    public ListaInicio() {
        inicio = null;
    }
    
    //PRIMER METODO: AGREGAR UN NODO
    //METODO QUE RECIBA UN NODO
    //EFICIENCIA --> OH(1)
    public void agregarNodo(Nodo nNuevo){
        //VERIFICAR EL ESTADO DE LA LISTA
        //ESTA VACIA?
        if(inicio == null){
            inicio = nNuevo;
        }
        //LISTA CON UN NODO
        else{
            //LLEVAR nTemp AL FINAL DE LA LISTA
            nNuevo.setSig(inicio);
            inicio = nNuevo;
        }
        //LISTA CON N NODOS
    }
    
    public void imprimir(){
        //LLEVAR AL FINAL DE LA LISTA
        Nodo nTemp = inicio;
            while(nTemp != null){
                System.out.println("[" + nTemp.getDato() + "]");
                nTemp = nTemp.getSig();
            }
            System.out.println("");
    }
}
