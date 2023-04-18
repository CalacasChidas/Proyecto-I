package com.example.minesweeperproyectoi;

/**
 * Clase Stack
 * Esta clase implementa una estructura de datos lineal de tipo pila, va insertando nodos en una lista pero solo puede "ver" o "utilizar" el último nodo que insertó.
 */
public class Stack {
    private Lista4 list;

    public Stack() {
        this.list = new Lista4();
    }

    /**
     *
     * @param x
     * @param y
     * Tipo: void
     * push(): Inserta un nodo al inicio de la lista.
     */
    public void push(int x, int y){
        this.list.insertFirst(x, y);
    }
    public int isEmpty(){
        if(list.getSize()==0){
            return 0;
        }else{
            return 1;
        }
    }

    /**
     *
     * @return String
     * pop(): No recibe nada, elimina el último nodo ingresado (viéndolo desde la lista, el primero, ya que se van insertando al inicio) y lo retorna. *Lo usa y luego lo borra*
     */
    public String pop(){
        return this.list.deleteFirst();
    }
}
