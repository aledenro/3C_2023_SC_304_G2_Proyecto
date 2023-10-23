
package proyectoestructuradatosavance1;

import javax.swing.JOptionPane;


public class Cola {
    private NodoCola frente;
    private NodoCola ultimo;

    public Cola() {
    }

    public NodoCola getFrente() {
        return frente;
    }

    public void setFrente(NodoCola frente) {
        this.frente = frente;
    }

    public NodoCola getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoCola ultimo) {
        this.ultimo = ultimo;
    }
    
    public void Encolar(){
        Clientes c = new Clientes();
        
        c.setNombre(JOptionPane.showInputDialog("Ingrese el nombre completo del cliente."));
        c.setCedula(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del cliente sin guiones.")));
        c.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente.")));
        c.setMembresia(JOptionPane.showInputDialog("¿El cliente cuenta con menbresia?"
                                                 + "\nIngrese si o no.").toLowerCase());
        c.setFechaReserva(JOptionPane.showInputDialog("Ingrese la fecha de la reserva en el siguiente formato."
                                                    + "\n01-01-2023"));
        
        NodoCola encolar = new NodoCola();
        
        encolar.setElemento(c);
        
        if(frente == null){
            frente = encolar;
            ultimo = encolar;
        }
        else{
            ultimo.setAtras(encolar);
            ultimo = encolar;
        }                                  
    }
    
    public void EncolarClone(NodoCola elemento){
        if(frente == null){
            frente = elemento;
            ultimo = elemento;
        }
        else{
            ultimo.setAtras(elemento);
            ultimo = elemento;
        }  
    }
    
    public void clienteSiguiente(){
        System.out.println("El proximo cliente de la cola es:"
                         + "\nNombre: " + frente.getElemento().getNombre()
                         + "\nCedula: " + frente.getElemento().getCedula()
                         + "\nEdad: " + frente.getElemento().getEdad()
                         + "\n¿Tiene Membresia? : " + frente.getElemento().getMembresia()
                         + "\nFecha de Reserva: " + frente.getElemento().getFechaReserva());
        frente = frente.getAtras();
    }
    
    public void vaciarCola(){
        while(frente != null){
            frente = frente.getAtras();
        }
        System.out.println("La cola está vacia.");
        
    }
    
    public void posicionCliente() {
        int posicion = 0;
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del cliente sin guiones."));
        NodoCola temp = frente; 

        if (temp == null) {
            System.out.println("La cola está vacía.");
        } 
        else {
            while (temp != null) {
                if (cedula == temp.getElemento().getCedula()) {
                    posicion += 1;
                    System.out.println("La persona buscada está en la posición número " + posicion + ".");
                    break; 
                } 
                else {
                    posicion += 1;
                    temp = temp.getAtras();
                }
            }

            if (temp == null) {
                System.out.println("La persona buscada no está en la cola.");
                }
        }
    }
    
    public void tamañoCola(){
        int tam = 0;
        NodoCola temp = frente;
        
        if (temp == null) {
            System.out.println("La cola está vacía.");
        }
        else{
            while (temp != null) {
                tam += 1;
                temp = temp.getAtras();
            }
            System.out.println("El tamaño de la cola es de " + tam + " clientes.");
        }
    }
    
    public void prioridadCliente(NodoCola elemento){
        if(elemento.getElemento().getMembresia().equals("si")){
            Cola colaclone = new Cola();
            colaclone.EncolarClone(elemento);
             
        }
        else{
            elemento = elemento.getAtras();
            prioridadCliente(elemento); 
        }
    }
    
    @Override
    public String toString(){
        String cadena = "Los clientes en la cola son:";
        NodoCola temp;
        temp = frente;
        
        if(temp == null){
            cadena = "La cola está vacía.";
        }else{
            while(temp != null){
                cadena += "\n-----------------------------------------------" 
                        + "\nNombre: " + temp.getElemento().getNombre()
                        + "\nCedula: " + temp.getElemento().getCedula()
                        + "\nEdad: " + temp.getElemento().getEdad()
                        + "\n¿Tiene Membresia? : " + temp.getElemento().getMembresia()
                        + "\nFecha de Reserva: " + temp.getElemento().getFechaReserva();
                
                temp = temp.getAtras();
            } 
        }
        return cadena;
    }
    
}
