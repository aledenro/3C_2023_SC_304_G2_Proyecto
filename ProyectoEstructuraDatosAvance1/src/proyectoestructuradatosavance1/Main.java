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
                    int idDesayuno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del desayuno"));
                    String descripcion = JOptionPane.showInputDialog("Ingrese la descripción del desayuno");
                    int tipo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo del desayuno"));
                    int calorias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las calorías del desayuno"));
                    Desayunos nuevoDesayuno = new Desayunos(idDesayuno, descripcion, tipo, calorias);
                    LSC.Insertar(nuevoDesayuno);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, LSC);
                    break;
                case 2:
                    int idModificar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del desayuno a modificar"));
                    Desayunos desayunoModificar = new Desayunos(idModificar, "", 0, 0);
                    LSC.ModificaDos(desayunoModificar);
                    break;
                case 3:
                   calorias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de calorias a consultar"));
                     LSC.ConsultaCalorias(calorias);
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
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la habitación"));
                    String[] tipoHab = {"Estandar", "Premium"};
                    int tipohabi = JOptionPane.showOptionDialog(null, "Horario de la Actividad", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, tipoHab, "Menu");
                    int cantidadCamas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de camas"));
                    String[] opcionesDisponibilidad = {"NO", "SI"};
                    int disponibilidadIndex = JOptionPane.showOptionDialog(null, "Disponibilidad de Habitaciones", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opcionesDisponibilidad, "Menu");
                    String disponibilidad = opcionesDisponibilidad[disponibilidadIndex];
                    String tipo = "";
                    
                    if(tipohabi  == 0){
                        tipo = "Estandar";
                    }else if(tipohabi  == 1){
                        tipo = "Premium";
                    }
                    
                    double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el  precio de la  habitación"));
                    
                    Habitaciones h =  new Habitaciones(id, tipo, cantidadCamas, disponibilidad, precio);

                    l.Insertar(h);
                    break;
                case 1:
                    String[] tipoHabitacion = {"Estandar", "Premium"};
                    tipohabi = JOptionPane.showOptionDialog(null, "Horario de la Actividad", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, tipoHabitacion, "Menu");
                    String tipoH = "";
                    
                    if(tipohabi  == 0){
                        tipoH = "Estandar";
                    }else if(tipohabi  == 1){
                        tipoH = "Premium";
                    }

                    System.out.println(l.printReservarHabitacion(tipoH));
                    
                    int idReservar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la habitación que desea reservar."));
                    l.reservarHabitacion(idReservar);
                    
                    break;
                case 2:
                    System.out.println(l.imprimirDisponibilidad());
                    break;
                case 3:
                    String[] criterio = {"Cantidad de camas", "ID", "Tipo de habitación", "Precio"};
                    int criterioIndex = JOptionPane.showOptionDialog(null, "Disponibilidad de Habitaciones", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, criterio, "Menu");
                    String Criterio = criterio[criterioIndex];
                    
                    if(criterioIndex == 0){
                        int criterioRev = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de camas"));
                    
                        int aumento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el porcentaje de aumento  de  precio que desea  aplicar.  No use %, solo ingrese el numero"));
                    
                        l.aumentarPrecio(Criterio, criterioRev, aumento);
                    }else if(criterioIndex == 1){
                        int criterioRev = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la  habitación"));
                    
                        int aumento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el porcentaje de aumento  de  precio que desea  aplicar.  No use %, solo ingrese el numero"));
                    
                        l.aumentarPrecio(Criterio, criterioRev, aumento);
                    }if(criterioIndex == 2){
                        String[] critRev = {"Estandar", "Premium"};
                    tipohabi = JOptionPane.showOptionDialog(null, "Horario de la Actividad", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, critRev, "Menu");
                    String criterioRevi = "";

                    if (tipohabi == 0) {
                       criterioRevi = "Estandar";
                    } else if (tipohabi == 1) {
                        criterioRevi = "Premium";
                    }
                         
                        int aumento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el porcentaje de aumento  de  precio que desea  aplicar.  No use %, solo ingrese el numero"));
                         l.aumentarPrecio(Criterio, tipohabi, aumento);
                     
                    }if(criterioIndex == 3){
                        int criterioRev = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio que desea modificar"));
                    
                        int aumento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el porcentaje de aumento  de  precio que desea  aplicar.  No use %, solo ingrese el numero"));
                    
                        l.aumentarPrecio(Criterio, criterioRev, aumento);
                    }
                    break;
                case 4:
                    break;

            }
        }
    }
}
