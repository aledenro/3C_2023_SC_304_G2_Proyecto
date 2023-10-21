/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoestructuradatosavance1;

import javax.swing.JOptionPane;

/**
 *
 * @author valer
 */
public class Main {

    private static Autos autos = new Autos();
    private static Clientes clientes = new Clientes();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuPrincipal();
        Pila NuevaPila = new Pila();
        NuevaPila.Apilar();
        NuevaPila.Apilar();

        System.out.println(NuevaPila.ImprimirPila());
    }

    public static void MenuPrincipal() {
        String[] opciones = {"Autos", "Clientes", "Salir"};
        int opcion = -1;
        while (opcion != opciones.length - 1) {
            opcion = JOptionPane.showOptionDialog(null, "Hotel", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Menu");;
            switch (opcion) {
                case 0:
                    autos.Menu();
                    break;
                case 1:
                    clientes.Menu();
                    break;

                case 3:
                    System.exit(0); //Termina la aplicación.
                    break;

            }
        }
    }
}
