
package proyectoestructuradatosavance1;

import javax.swing.JOptionPane;


public class Main {

    private static Autos autos = new Autos();
    private static Clientes clientes = new Clientes();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Cola cola = new Cola();
       
       cola.Encolar();
       cola.Encolar();
       cola.Encolar();
       cola.Encolar();
       System.out.println(cola.toString());
       cola.prioridadCliente(cola.getFrente());
        
        System.out.println("Nueva Cola");
        System.out.println(cola.toString());
       
       //System.out.println(cola.toString());
       
       
        //MenuPrincipal();
        /*Pila NuevaPila = new Pila();
        NuevaPila.Apilar();
        NuevaPila.Apilar();
        NuevaPila.Apilar();
        
        
     
        System.out.println(NuevaPila.ImprimirPila());
        System.out.println(NuevaPila.ImprimirAuto(Integer.parseInt(JOptionPane.showInputDialog("Cual es la placa que busca"))));
        NuevaPila.EstacionadoRecursiva(Integer.parseInt(JOptionPane.showInputDialog("Digite su placa para buscar si esta estacionado ")));
        */
    }

    /*public static void MenuPrincipal() {
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
    }*/
}
