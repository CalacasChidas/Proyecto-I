/**
 * Nodo #3
 */
package com.example.minesweeperproyectoi;

public class Node3 {
    public Object data;
    public Node3 next;
    public boolean bomb;

    /**
     *
     * @param data
     * @param bomb
     * Constructor del Nodo #3.
     */
    public Node3(Object data, Boolean bomb) {
        this.data = data;
        this.next = null;
        this.bomb = bomb;
    }
    /**
     *get_(): getters de información.
     *set_(): setters de información.
     *is_(): getters de booleans.
     */
    public boolean getBomb() {
        return bomb;
    }

    public void setNext(Node3 next) {
        this.next = next;
    }

}



