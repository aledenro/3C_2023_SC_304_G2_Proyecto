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
        if (!EstaVacia()) {
            Nodo temp = top;
            while (temp != null) {
                respuesta += temp.getElemento().getPlaca() + "\n";
                temp = temp.getSiguiente();

            }
        } else {
            respuesta = "La pila esta vacia";
        }
        return respuesta;

    }

         /* bunta  ii :Obtener un vehículo del estacionamiento: Recibir como parámetro la
placa del vehículo, recorrer la pila e indicar cuántos vehículos hay que
des apilar para sacar el vehículo deseado. */   
    public String ImprimirAuto(int placa) {
        
        String respuesta = "";
        String temporal = "";
        int contador = 0;
        if (!EstaVacia()) {
            Nodo temp = top;
            while (temp != null) {
                temporal += temp.getElemento().getPlaca() + "\n";
                if (temp.getElemento().getPlaca() == placa) {
                    respuesta = "Los carros que hay que sacar  son   :  " +String.valueOf(contador);
                    break;
                } else if (temp.getElemento().getPlaca() != placa) {
                    contador++;
                    temp = temp.getSiguiente();
                }

            }
        } else {
            respuesta = "No hay vehiculos estacionados ";
        }
        return respuesta;
}
    
    /* bunta vi Verificar si el vehículo está estacionado: Ingresar la placa del vehículo y
mediante recursividad verificar si está o no estacionado. */
    public void EstacionadoRecursiva(int placa) {

        if (placa == top.getElemento().getPlaca()) {

            JOptionPane.showMessageDialog(null,"Esta estacionado");
        } else {
            
            top=top.getSiguiente();
            if (top == null) {
            JOptionPane.showMessageDialog(null,"No esta el vehiculo estacionado");
            return;
        }
            EstacionadoRecursiva(placa);
        }
    }
    
    public String Conteo() {
        String respuesta = "";
        int contar = 0;
        if (!EstaVacia()) {
            Nodo temp = top;
            while (temp != null) {
                temp = temp.getSiguiente();
                contar = contar + 1;
            }
            respuesta = "La cantidad de vehiculos en el estacionamiento es de: " + contar;
        } else {
            respuesta = "La pila esta vacia";
        }
        return respuesta;
    }
    
    public void vaciarParqueo(){
        if(!EstaVacia()){
            Nodo aux = top;
            
            while(aux != null){
                Desapilar();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "El estacionamiento está vacío.");
        }
    }
    
}
