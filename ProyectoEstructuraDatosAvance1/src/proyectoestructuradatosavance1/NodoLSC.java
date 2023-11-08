/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructuradatosavance1;

/**
 *
 * @author valer
 */
public class NodoLSC {
    
    private Desayunos dato;
    private NodoLSC siguiente;

    public NodoLSC(Desayunos dato) {
        this.dato = dato;
    }

    
    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato.getIdDesayuno()+ ' ' + dato.getDescripcion()+ '}';
    }

    public Desayunos getDato() {
        return dato;
    }

    public void setDato(Desayunos dato) {
        this.dato = dato;
    }

    public NodoLSC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLSC siguiente) {
        this.siguiente = siguiente;
    }

 

 
}
