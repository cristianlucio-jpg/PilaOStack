/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristian Alexis Lucio Narvaez
 */
public class Pila {
    private Nodo inicio;

    // Método constructor
    public void Pila() {
        inicio = null;
    }

    // Método isEmpty (Metodo devuelve True o False 
    //dependiendo del valor que tenga al inicio)
    public boolean esVacia() {
        return inicio == null;
    }

    // Método Push
    public void apilar(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    // Método Pop (desapilar)
    public int desapilar() {
        if (!esVacia()) {
            int dato = inicio.getValor();
            inicio = inicio.getSiguiente();
            return dato;
        } else {
            return Integer.MAX_VALUE; // Indicador de pila vacía
        }
    }
     public void mostrarPila() {
        Nodo aux = inicio;//Crea una copia de la pila.
        //Recorre la pila hasta el último nodo.
        while (aux != null) {
            System.out.println("|\t" + aux.getValor() + "\t|");
            aux = aux.getSiguiente();
        }
    }
     
    public boolean buscar(int aBuscar){
        Nodo aux = inicio; // **aux** toma la referencia del Nodo tope de la pila
        boolean existe = false; //**exite** es utilizada para verificar si se encuentra el elemento a buscar
        //El siguiente proceso permite recorrer la pila hasta hasta encontrar el Nodo o llegar el final
        while(existe != true && aux != null){
        //Este proceso compara si el valor del nodo es igual al valor a buscar
            if (aBuscar==aux.getValor()) {
                existe = true; //**existe** indicará que el valor fue encontrado
            }else{
                aux = aux.getSiguiente();//**aux** avanza al siguiente nodo.
            }
        }
        return existe;//Termina y retorna true o false
    }
    //Método elimina pila 
    public void eliminar(){
        inicio = null;
    }
    
    public void retirar(){
        if (!esVacia()) {
        inicio = inicio.getSiguiente();
        }
    }
    
    public int cantidad(){
        int cant = 0;
        Nodo aux = inicio;
        while(aux!=null){
            cant++;
            aux=aux.getSiguiente();
        }
        return cant;
    }
    
    
}


 


 
