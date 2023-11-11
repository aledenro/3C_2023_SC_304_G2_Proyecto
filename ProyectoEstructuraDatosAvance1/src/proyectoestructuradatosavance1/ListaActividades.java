/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructuradatosavance1;

import javax.swing.JOptionPane;

/**
 *
 * @author valer
 */
public class ListaActividades {

    private NodoActividad cabeza;
    private NodoActividad ultimo;
//i. Ingresar nuevas habitaciones

    public void Insertar(Actividad a) {
     
        Actividad h = new Actividad();
 
        
        // Crear el objeto Actividad con la entrada del usuario
        if (cabeza == null) {
            cabeza = new NodoActividad(a);
            ultimo = cabeza;
            cabeza.setAnterior(ultimo);
            cabeza.setSiguiente(ultimo);
            ultimo.setSiguiente(cabeza);
            ultimo.setAnterior(cabeza);

        } else {
            if (cabeza.getDato().getIdActividad()> a.getIdActividad()) {
                NodoActividad aux = new NodoActividad(a);
                aux.setSiguiente(cabeza);
                cabeza.setAnterior(aux);
                cabeza = aux;
                cabeza.setAnterior(ultimo);
                ultimo.setSiguiente(cabeza);

            } else {
                if (a.getIdActividad()> ultimo.getDato().getIdActividad()) {
                    NodoActividad aux = new NodoActividad(a);
                    aux.setAnterior(ultimo);
                    ultimo.setSiguiente(aux);
                    ultimo = aux;
                    ultimo.setSiguiente(cabeza);
                    cabeza.setAnterior(ultimo);
                } else {
                    NodoActividad aux = cabeza.getSiguiente();
                    while (aux.getDato().getIdActividad()< a.getIdActividad()) {
                        aux = aux.getSiguiente();
                    }
                    NodoActividad temp = new NodoActividad(a);
                    temp.setAnterior(aux.getAnterior());
                    temp.setSiguiente(aux);
                    aux.setAnterior(temp);
                    temp.getAnterior().setSiguiente(temp);
                }
            }
        }
    }

//ii. Reservar una habitación: El usuario ingresa el tipo de habitación que
//desea y se deben mostrar las habitaciones disp   
//iii. Imprimir habitacones       
    @Override
    public String toString() {
        String respuesta = "Actividad \n";
        if (cabeza != null) {
            NodoActividad aux = cabeza;
            respuesta += aux.toString() + "\n";
            aux = aux.getSiguiente();
            while (aux != cabeza) {
                respuesta += aux.toString() + "\n";
                aux = aux.getSiguiente();
            }
        } else {
            respuesta += "No hay habitaciones";
        }
        return respuesta;
    }

//iv. Incrementar tarifa 
}
