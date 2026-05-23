
/**
 *
 * @author Cristian Alexis lucio Narvaez
 */
public class Nodo {
    private int valor; // Variable o lista de variables para guardar datos.
    private Nodo sig; // Atributo para hacer referencia al nodo siguiente.
    
    //Método constructor que inicializamos el valor de las variables.
    public Nodo() {
        this.valor = 0;
        this.sig = null;
    }
    //Métodos get y set para los atributos
    public int getValor() { 
        return valor; 
    }
    public void setValor(int valor) { 
        this.valor = valor; 
    }
    public Nodo getSiguiente() { 
        return sig; 
    }
    public void setSiguiente(Nodo sig) { 
        this.sig = sig; 
    }
}