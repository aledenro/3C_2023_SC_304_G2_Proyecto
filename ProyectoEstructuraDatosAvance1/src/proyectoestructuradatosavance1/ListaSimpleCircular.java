/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructuradatosavance1;

/**
 *
 * @author valer
 */
public class ListaSimpleCircular {

    NodoLSC cabeza;
    NodoLSC ultimo;
    
    
//i. InsertaDesayunos
    public void Insertar(Desayunos elemento){
        if(cabeza == null){
            cabeza = new NodoLSC(elemento);
            ultimo = cabeza;
            ultimo.setSiguiente(cabeza);
            
        }
        else{
            if(elemento.getIdDesayuno()< cabeza.getDato().getIdDesayuno()){
                NodoLSC auxiliar = new NodoLSC(elemento);
                auxiliar.setSiguiente(cabeza);
                cabeza = auxiliar;
                ultimo.setSiguiente(cabeza);
            }
            else{
                if(ultimo.getDato().getIdDesayuno()< elemento.getIdDesayuno()){
                    NodoLSC auxiliar = new NodoLSC(elemento);
                    ultimo.setSiguiente(auxiliar);
                    ultimo = auxiliar;
                    ultimo.setSiguiente(cabeza);
                }else{
                    NodoLSC auxiliar = cabeza;
                    while(auxiliar.getSiguiente().getDato().getIdDesayuno()< elemento.getIdDesayuno()){
                        auxiliar = auxiliar.getSiguiente();
                    }
                    NodoLSC temporal = new NodoLSC(elemento);
                    temporal.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(temporal);
                }
            }
        }
    
    
    
    }
    
//ii. Imprimir Desayunos
    public void Modifica(Desayunos o) {
        if (cabeza != null) {
            if (o.getIdDesayuno() >= cabeza.getDato().getIdDesayuno() && o.getIdDesayuno() <= ultimo.getDato().getIdDesayuno()) {
                NodoLSC aux = cabeza;
                while (aux != ultimo && aux.getDato().getIdDesayuno() < o.getIdDesayuno()) {
                    aux = aux.getSiguiente();
                }

                if (aux.getDato().getIdDesayuno() == o.getIdDesayuno()) {
                    aux.getDato().setDescripcion(o.getDescripcion());
                }
            }
        }

    }
//iii.Modifica el desayuno
    @Override
    public String toString() {
        String respuesta = "Lista circular: \n";
        NodoLSC auxiliar = cabeza;

        if (auxiliar != null) {
            respuesta += auxiliar.toString();
            auxiliar = auxiliar.getSiguiente();
            while (auxiliar != cabeza) {
                respuesta += auxiliar.toString() + "\n";
                auxiliar = auxiliar.getSiguiente();

            }
        } else {
            respuesta += "Vacía";
        }
        return respuesta;
    }

//iv. Crear un método que permita obtener la lista de los desayunos que
//tienen menos de cierta cantidad de calorías: El usuario ingresa la
//cantidad de calorías y se le muestra la lista con los desayunos que
//tienen menos de esa cantidad. (5)
}
