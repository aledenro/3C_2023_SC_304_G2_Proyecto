
package proyectoestructuradatosavance1;

import javax.swing.JOptionPane;


public class Main {

    private static Autos autos = new Autos();
    private static Clientes clientes = new Clientes();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuPrincipal();
       
    }
        
       public static void MenuPrincipal() {
        String[] opciones = {"Autos", "Clientes", "Salir"};
        int opcion = -1;
        while (opcion != opciones.length - 1) {
            opcion = JOptionPane.showOptionDialog(null, "Bienvenido al Hotel", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Menu");;
            switch (opcion) {
                case 0:
                    MenuSecundarioAutos();
                    break;
                case 1:
                    MenuSecundarioClientes();
                    break;
                case 3:
                    System.exit(0); //Termina la aplicación.
                    break;

            }
        }
    }

    public static void MenuSecundarioAutos() {
        Pila pila = new Pila();//creamos donde se guardaran los datos de la pila
        String[] opciones = {"Ingresar un Vehiculo", "Obtener Vehiculo", "Vaciar el Estacionamiento", "Cantidad de Vehiculos Estacionados", "Ver Vehiculos Estacionados", "Verificar si está Estacionado", "Regresar"};
        int opcion = -1;
        while (opcion != opciones.length - 1) {
            opcion = JOptionPane.showOptionDialog(null, "Menu Estacionamiento", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Menu");;
            switch (opcion) {
                case 0:
                    pila.Apilar();
                    break;
                case 1:
                    int placa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la placa a buscar"));
                    JOptionPane.showMessageDialog(null, pila.ImprimirAuto(placa));
                    break;
                case 2:
                    pila.vaciarParqueo();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, pila.Conteo());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,pila.ImprimirPila());
                    break;
                case 5:
                    placa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la placa a buscar"));
                    pila.EstacionadoRecursiva(placa);
                    break;

                case 6:
                    break;

            }
        }
    }

    public static void MenuSecundarioClientes() {
        Cola cola = new Cola();
        String[] opciones = {"Ingresar Cliente", "Atender Cliente", "Vaciar Cola", "Ubicar Posicion del Cliente", "Cantidad de Clientes", "Prioridad con Membresia", "Salir"};
        int opcion = -1;
        while (opcion != opciones.length - 1) {
            opcion = JOptionPane.showOptionDialog(null, "Menu Clientes", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Menu");;
            switch (opcion) {
                case 0:
                    cola.Encolar();
                    break;
                case 1:
                    cola.clienteSiguiente();
                    break;
                case 2:
                    cola.vaciarCola();
                    break;
                case 3:
                    cola.posicionCliente();
                    break;
                case 4:
                    cola.tamañoCola();
                case 5:
                   cola.prioridadCliente(cola.getFrente());
                   JOptionPane.showMessageDialog(null, cola.toString());
                    break;
                case 6:
                    break;

            }
        }
    }
}
