package proyectoestructuradatosavance1;

import javax.swing.JOptionPane;

public class Main {
    
    private static Autos autos = new Autos();
    private static Clientes clientes = new Clientes();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaSimpleCircular LSCC = new ListaSimpleCircular();
        LSCC.Insertar(new Desayunos(1,"A",1,10));
        LSCC.Insertar(new Desayunos(2,"B",1,20));
        LSCC.Insertar(new Desayunos(3,"C",1,30));
        LSCC.Insertar(new Desayunos(4,"D",1,50));
        LSCC.Insertar(new Desayunos(5, "C", 1, 40));
        LSCC.ConsultaCalorias(35);
        
        //Eran test para probart todo borrar todo lo de arriba
        //MenuPrincipal();
        
    }
}
    
    /*public static void MenuPrincipal() {
        String[] opciones = {"Autos", "Clientes", "Desayunos", "Itinerarios", "Habitaciones", "Salir"};
        int opcion = -1;
        while (opcion != opciones.length - 1) {
            opcion = JOptionPane.showOptionDialog(null, "Bienvenido al Hotel", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Menu");
            switch (opcion) {
                case 0:
                    MenuSecundarioAutos();
                    break;
                case 1:
                    MenuSecundarioClientes();
                    break;
                case 2:
                    MenuSecundarioDesayunos();
                    break;
                case 3:
                    MenuSecundarioItinerario();
                    break;
                case 4:
                    MenuSecundarioHabitaciones();
                    break;
                
                case 5:
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
                    JOptionPane.showMessageDialog(null, pila.ImprimirPila());
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
    
    public static void MenuSecundarioDesayunos() {
        ListaSimpleCircular LSC = new ListaSimpleCircular();
        String[] opciones = {"Ingresar Desayuno", "Ver Desayunos", "Modificar Desayuno", "Desayunos dieteticos", "Salir"};
        int opcion = -1;
        while (opcion != opciones.length - 1) {
            opcion = JOptionPane.showOptionDialog(null, "Menu Desayunos", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Menu");;
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    LSC.toString();
                    break;
                case 2:
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                
            }
        }
    }
    
    public static void MenuSecundarioItinerario() {
        
        ListaActividades la = new ListaActividades();
        String[] opciones = {"Ingresar Nueva Actividad", "Ver Todas las Actividades", "Eliminar Actividad", "Mostrar Actividades por Horario", "Salir"};
        int opcion = -1;
        while (opcion != opciones.length - 1) {
            opcion = JOptionPane.showOptionDialog(null, "Menu Itinerario", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Menu");
            switch (opcion) {
                case 0:
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la actividad"));
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la actividad");
                    String[] horario = {"Diurno", "Nocturno"};
                    int horarios = JOptionPane.showOptionDialog(null, "Horario de la Actividad", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, horario, "Menu");
                    int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de la actividad"));
                    la.Insertar(new Actividad(id, nombre, horario[horarios], precio));
                    break;
                case 1:
                    String[] orden = {"A", "D"};
                    int Orden = JOptionPane.showOptionDialog(null, "Seleccione A para mostrarlo de forma ascendente y D para mostralo de forma descendente", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, orden, "Menu");
                    System.out.println(la.imprimirActividades(orden[Orden]));
                    break;
                case 2:
                    int borrarid = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la actividad que desea eliminar"));
                    la.elimarActividad(borrarid);
                    break;
                case 3:
                    String[] horarioP = {"Diurno", "Nocturno"};
                    horarios = JOptionPane.showOptionDialog(null, "Menu Itinerario", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, horarioP, "Menu");
                    System.out.println(la.imprimirPorHorario(horarioP[horarios]));
                    break;
                case 4:
                    break;   
            }
        }
    }
    
    public static void MenuSecundarioHabitaciones() {
        ListaDobleCircular l = new ListaDobleCircular();
        String[] opciones = {"Ingresar Nueva Habitacion", "Reservar habitacion", "Ver Habitaciones disponibles", "Incrementar tarifa", "Salir"};
        int opcion = -1;
        while (opcion != opciones.length - 1) {
            opcion = JOptionPane.showOptionDialog(null, "Menu Habitaciones", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Menu");;
            switch (opcion) {
                case 0:
                    
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                
            }
        }
    }
}
*/