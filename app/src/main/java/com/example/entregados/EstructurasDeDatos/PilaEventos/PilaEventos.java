package com.example.entregados.EstructurasDeDatos.PilaEventos;

import com.example.entregados.EstructurasDeDatos.IU.MenuCrearEvento.DatosEventos;

public class PilaEventos {
    // Puntero que indica el inicio de la pila o tambein conocida como el
    // tope de la pila.
    private NodoPila inicio;
    // Variable para registrar el tamaño de la pila.
    private int tamanio;
    /**
     * Constructor por defecto.
     */
    public void PilaEventos(){
        inicio = null;
        tamanio = 0;
    }
    /**
     * Consulta si la pila esta vacia.
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean esVacia(){
        return inicio == null;
    }
    /**
     * Consulta cuantos elementos (nodos) tiene la pila.
     * @return numero entero entre [0,n] donde n es el numero de elementos
     * que contenga la lista.
     */
    public int getTamanio(){
        return tamanio;
    }
    /**
     * Agrega un nuevo nodo a la pila.
     * @param valor a agregar.
     */
    public void apilar(DatosEventos valor){
        // Define un nuevo nodo.
        NodoPila nuevo = new NodoPila();
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
        // Consulta si la pila esta vacia.
        if (esVacia()) {
            // Inicializa la pila con el nuevo valor.
            inicio = nuevo;
        }
        // Caso contrario agrega el nuevo nodo al inicio de la pila.
        else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        // Incrementa el contador del tamaño.
        tamanio++;
    }
    /**
     * Elimina el elemento que se encuentra en el tope de la piala.
     */
    public void retirar(){
        if (!esVacia()) {
            // Asigna como primer nodo al siguiente de la pila.
            inicio = inicio.getSiguiente();
            // Decrementa el contador del tamaño de la pila
            tamanio--;
        }
    }
    /**
     * Consulta el valor del nodo que se encuentra en la cima de la pila
     *
     * @return valor del nodo.
     * @throws Exception
     */
    public DatosEventos cima() throws Exception{
        if(!esVacia()){
            return inicio.getValor();
        } else {
            throw new Exception("La pila se encuentra vacia.");
        }
    }
    public boolean buscar(String referencia){
        // Crea una copia de la pila.
        NodoPila aux = inicio;
        // Bandera para verificar si existe el elemento a buscar.
        boolean existe = false;
        // Recorre la pila hasta llegar encontrar el nodo o llegar al final
        // de la pila.
        while(existe != true && aux != null){
            // Compara si el valor del nodo es igual que al de referencia.
            if (referencia.equals(aux.getValor())) {
                // Cambia el valor de la bandera.
                existe = true;
            }
            else{
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el valor de la bandera.
        return existe;
    }
    public void listar(){
        System.out.println("Lista Eventos");
        // Crea una copia de la pila.
        NodoPila aux = inicio;
        // Recorre la pila hasta el ultimo nodo.
        while(aux != null){
            System.out.println("|\t" + aux.getValor().getNombre() + "\t|");
            System.out.println("|\t" + aux.getValor().getLugar() + "\t|");
            System.out.println("|\t" + aux.getValor().getDia() + "\t|");
            System.out.println("|\t" + aux.getValor().getHora() + "\t|");
            System.out.println("|\t" + aux.getValor().getEspecificaciones() + "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }
}
