
package proyectoestructuradatosavance1;

import proyectoestructuradatosavance1.Autos;

public class NodoPila {
    
    private Autos elemento;
    private NodoPila siguiente;

    public NodoPila() {
        this.siguiente = null;
    }

    public Autos getElemento() {
        return elemento;
    }

    public void setElemento(Autos elemento) {
        this.elemento = elemento;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
 
}
