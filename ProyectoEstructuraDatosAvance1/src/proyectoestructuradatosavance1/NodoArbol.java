
package proyectoestructuradatosavance1;

/**
 *
 * @author alede
 */
public class NodoArbol {
    Clientes cliente;
    NodoArbol derecha;
    NodoArbol izquierda;

    public NodoArbol(Clientes c) {
        this.cliente = c;
        izquierda = derecha = null;
    }
}
