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
public class Autos {
    private int Placa;
    private String Color;
    private int cantidadPuertas;

    public Autos(int Placa, String Color, int cantidadPuertas) {
        this.Placa = Placa;
        this.Color = Color;
        this.cantidadPuertas = cantidadPuertas;
    }

    public Autos() {
    }

    public int getPlaca() {
        return Placa;
    }

    public void setPlaca(int Placa) {
        this.Placa = Placa;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return "Autos{" + "Placa=" + Placa + ", Color=" + Color + ", cantidadPuertas=" + cantidadPuertas + '}';
    }

      public void Menu() {
        int opcion = -1;
        String[] opciones = {"APilar", "Vaciar Estacionamiento", "Consultar por Placa"};
        while (opcion != opciones.length - 1) {
            opcion = JOptionPane.showOptionDialog(null, "Hotel", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Estacionamiento");
            switch (opcion) {
                case 0:

                    break;

            }
        }
    }
    
    
    
    
    
}
