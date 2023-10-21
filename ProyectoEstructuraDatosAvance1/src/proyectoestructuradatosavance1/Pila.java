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
public class Pila {

    //DECLARAMOS LOS ATRIBUTOS 
    private Nodo top;

    public Nodo getCima() {//que devuelva el primero 
        return top;
    }

    public Pila() {//porque aun no se que elementos tengo
        this.top = null;
    }

    public boolean EstaVacia() {
        if (top == null) {

            return true;
        } else {
            return false;
        }

    }

    public void Apilar() {
        Autos autos = new Autos();
        autos.setPlaca(Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la placa")));

        Nodo Tarjeta = new Nodo();
        Tarjeta.setElemento(autos);

        if (EstaVacia()) {
            top = Tarjeta;
        } else {
            Tarjeta.setSiguiente(top);
            top = Tarjeta;
        }
    }

    public void Desapilar() {
        if (!EstaVacia()) {
            Nodo Tarjeta = top;
            top = top.getSiguiente();
            System.out.println("Extraido");
            if (!EstaVacia()) {
                Pila Dos = new Pila();
                Dos.Apilar();

            }
        }

    }

    public String ImprimirPila() {
        String respuesta = "";
        int contar = 0;
        if (!EstaVacia()) {
            Nodo temp = top;
            while (temp != null) {
                respuesta += temp.getElemento().getPlaca() + "\n";
                temp = temp.getSiguiente();
                contar = contar + 1;

            }

        } else {
            respuesta = "La pila esta vacia";
        }
        return respuesta + "La cantidad de autos en el estacionamiento es " + contar;

    }

    public void Menu() {
        int opcion = -1;
        String[] opciones = {"APilar", "Vaciar Estacionamiento", "Consultar por Placa"};
        while (opcion != opciones.length - 1) {
            opcion = JOptionPane.showOptionDialog(null, "Hotel Country Place", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Estacionamiento");
            switch (opcion) {
                case 0:

                    break;

            }
        }
    }
}
