/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructuradatosavance1;

/**
 *
 * @author valer
 */
public class NodoLDC2 {
    private Actividad dato;
    NodoLDC2 anterior;
    NodoLDC2 siguiente;

    public NodoLDC2(Actividad dato) {
        this.dato = dato;
    }

    public Actividad getDato() {
        return dato;
    }

    public void setDato(Actividad dato) {
        this.dato = dato;
    }

    public NodoLDC2 getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLDC2 anterior) {
        this.anterior = anterior;
    }

    public NodoLDC2 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLDC2 siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return dato.toString();
    }
}
