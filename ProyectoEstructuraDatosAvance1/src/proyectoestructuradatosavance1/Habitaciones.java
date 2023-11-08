/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructuradatosavance1;

/**
 *
 * @author valer
 */
public class Habitaciones {
    private int idHabitacion;
    private int tipo;
    private int cantidadCamas;
    private boolean disponibilidad;

    public Habitaciones() {
    }

    public Habitaciones(int idHabitacion, int tipo, int cantidadCamas, boolean disponibilidad) {
        this.idHabitacion = idHabitacion;
        this.tipo = tipo;
        this.cantidadCamas = cantidadCamas;
        this.disponibilidad = disponibilidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    @Override
    public String toString() {
        return "Habitaciones{" + "idHabitacion=" + idHabitacion + ", tipo=" + tipo + ", cantidadCamas=" + cantidadCamas + ", disponibilidad=" + disponibilidad + '}';
    }
    
    
    
}
