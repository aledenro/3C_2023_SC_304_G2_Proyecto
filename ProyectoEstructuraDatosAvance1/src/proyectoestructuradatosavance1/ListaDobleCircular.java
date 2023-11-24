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
public class ListaDobleCircular {

    private NodoLDC cabeza;
    private NodoLDC ultimo;
//i. Ingresar nuevas habitaciones

    public void Insertar(Habitaciones p) {
        //private int idHabitacion;
        //private int tipo;
        //private int cantidadCamas;
        //private boolean disponibilidad;
 
        // Crear el objeto Habitaciones con la entrada del usuario
        if (cabeza == null) {
            cabeza = new NodoLDC(p);
            ultimo = cabeza;
            cabeza.setAnterior(ultimo);
            cabeza.setSiguiente(ultimo);
            ultimo.setSiguiente(cabeza);
            ultimo.setAnterior(cabeza);

        } else {
            if (cabeza.getDato().getIdHabitacion() > p.getIdHabitacion()) {
                NodoLDC aux = new NodoLDC(p);
                aux.setSiguiente(cabeza);
                cabeza.setAnterior(aux);
                cabeza = aux;
                cabeza.setAnterior(ultimo);
                ultimo.setSiguiente(cabeza);

            } else {
                if (p.getIdHabitacion() > ultimo.getDato().getIdHabitacion()) {
                    NodoLDC aux = new NodoLDC(p);
                    aux.setAnterior(ultimo);
                    ultimo.setSiguiente(aux);
                    ultimo = aux;
                    ultimo.setSiguiente(cabeza);
                    cabeza.setAnterior(ultimo);
                } else {
                    NodoLDC aux = cabeza.getSiguiente();
                    while (aux.getDato().getIdHabitacion() < p.getIdHabitacion()) {
                        aux = aux.getSiguiente();
                    }
                    NodoLDC temp = new NodoLDC(p);
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
        String respuesta = "Habitaciones \n";
        if (cabeza != null) {
            NodoLDC aux = cabeza;
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
    
    public String imprimirDisponibilidad(String D){
        String print = "";
        String NoDisponibles = "";
        String SiDisponibles = "";
        NodoLDC aux = cabeza;
        
        if(cabeza != null){
            if(D.equalsIgnoreCase("NO")){
                if(aux.getDato().isDisponibilidad().equalsIgnoreCase("NO")){
                    NoDisponibles += aux.getDato().toString();
                }
                
                aux = aux.getSiguiente();
                while(aux != cabeza){
                    if(aux.getDato().isDisponibilidad().equalsIgnoreCase("NO")){
                        NoDisponibles += aux.getDato().toString();
                    }
                    aux = aux.getSiguiente();
                }
            }
            
            if(D.equalsIgnoreCase("SI")){

                if(aux.getDato().isDisponibilidad().equalsIgnoreCase("SI")){
                    SiDisponibles += aux.getDato().toString();
                }
                
                aux = aux.getSiguiente();
                while(aux != cabeza){
                    if(aux.getDato().isDisponibilidad().equalsIgnoreCase("SI")){
                        SiDisponibles += aux.getDato().toString();
                    }
                    aux = aux.getSiguiente();
                }
            }
            print = SiDisponibles+NoDisponibles; 
        }else{
            print = "La lista de HABITACIONES está vacía";
        }
            
        return print;
    }
//iv. Incrementar tarifa 
}
