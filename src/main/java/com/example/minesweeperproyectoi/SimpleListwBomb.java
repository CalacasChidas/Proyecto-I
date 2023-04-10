/**
 * Lista #3.
 */
package com.example.minesweeperproyectoi;
public class SimpleListwBomb {
    public Node3 head;
    private int size;
    /**
     * Constructor de la Lista #3.
     */
    public SimpleListwBomb() {
        this.head = null;
        this.size = 0;
    }
    /**
     *get_(): getters de información.
     *set_(): setters de información.
     *is_(): getters de booleans.
     */
    public int getSize() {
        return size;
    }

    public Node3 getHead() {
        return head;
    }
    /**
     *
     * @param data Object
     * @param bomb Boolean
     * @return void
     * insertFirst: Inserta un nodo al inicio de la lista, recibiendo los parámetros data y bomb..
     */
    public void insertFirst(Object data, boolean bomb) {
        Node3 newNode = new Node3(data, bomb);
        if (this.size == 0) {
            this.head = newNode;
        }else{
            newNode.setNext(this.head);
            this.head = newNode;
        }this.size++;
    }
    /**
     *
     * @param pos
     * @return Node current.
     * find(): Busca en la lista el nodo en posición x (no lo busca como matrix si no como lista enlazada sencilla).
     * Retorna el nodo encontrado.
     */
    public Node3 find(int pos){
        int cont = 0;
        Node3 current = this.head;
        while (cont != pos) {
            current = current.next;
            cont++;
        }
        return current;
    }
}
