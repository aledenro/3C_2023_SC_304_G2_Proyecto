/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructuradatosavance1;

/**
 *
 * @author valer
 */
public class Actividad {
    private int idActividad;
    private String descripcionActividad;
    private int tipoHorario;
    private int costo;

    public Actividad() {
    }

    public Actividad(int idActividad, String descripcionActividad, int tipoHorario, int costo) {
        this.idActividad = idActividad;
        this.descripcionActividad = descripcionActividad;
        this.tipoHorario = tipoHorario;
        this.costo = costo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        this.descripcionActividad = descripcionActividad;
    }

    public int getTipoHorario() {
        return tipoHorario;
    }

    public void setTipoHorario(int tipoHorario) {
        this.tipoHorario = tipoHorario;
    }

    @Override
    public String toString() {
        return "Actividad{" + "idActividad=" + idActividad + ", descripcionActividad=" + descripcionActividad + ", tipoHorario=" + tipoHorario + ", costo=" + costo + '}';
    }
    
    
}
