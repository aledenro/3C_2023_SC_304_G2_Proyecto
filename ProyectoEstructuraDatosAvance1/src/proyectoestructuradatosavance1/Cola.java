
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
        int membresia =JOptionPane.showConfirmDialog(null, "¿Tiene membresia?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if(membresia==0){
            c.setMembresia("si");
        }else{
            c.setMembresia("no");
        }
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
    
    //bunta 5.vi//
     public void EncolarCola(Clientes ci){
        Clientes c = new Clientes();
        
        c.setNombre(ci.getNombre());
        c.setCedula(ci.getCedula());
        c.setEdad(ci.getEdad());
        c.setMembresia(ci.getMembresia());
        c.setFechaReserva(ci.getFechaReserva());
        
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
    
    NodoCola frenteClone;
    NodoCola ultimoClone;
    NodoCola frenteAux;
    NodoCola ultimoAux;
    
    public void EncolarClone(NodoCola elemento){
        NodoCola encolar = new NodoCola();
        
        encolar.setElemento(elemento.getElemento());
        
        if(frenteClone == null){
            frenteClone = encolar;
            ultimoClone = encolar;
        }
        else{
            ultimoClone.setAtras(encolar);
            ultimoClone = encolar;
        }                       
    }
    
    public void Encolaraux(NodoCola elemento){
          NodoCola encolar = new NodoCola();
        
        encolar.setElemento(elemento.getElemento());
        
        if(frenteAux == null){
            frenteAux = encolar;
            ultimoAux = encolar;
        }
        else{
            ultimoAux.setAtras(encolar);
            ultimoAux = encolar;
        }                                
    }
    
    int contadorPrioridad = 0;

    public void prioridadCliente(NodoCola elemento) {
        if (elemento != null) {
            if (elemento.getElemento().getMembresia().equals("si")) {
                EncolarClone(elemento);
                
                contadorPrioridad++;
                frente = frente.getAtras();
            } else {
                if (elemento.getElemento().getMembresia().equals("no")) {
                    Encolaraux(elemento);
                    
                    frente = frente.getAtras();
                }
            }
            prioridadCliente(frente);
        } else {
            System.out.println("los clientes con prioridad son: " + contadorPrioridad);
         
            while (frenteClone != null) {
                EncolarCola(frenteClone.getElemento());
                frenteClone = frenteClone.getAtras();
            }
            while (frenteAux != null) {
                EncolarCola(frenteAux.getElemento());
                frenteAux = frenteAux.getAtras();
            }
        }
    }
         
    
    
}

