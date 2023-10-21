/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructuradatosavance1;

import proyectoestructuradatosavance1.Autos;

/**
 *
 * @author valer
 */
public class Nodo {
    
    private Autos elemento;
    private Nodo siguiente;

    public Nodo() {
        this.siguiente = null;
    }

    public Autos getElemento() {
        return elemento;
    }

    public void setElemento(Autos elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
 
}
