package com.example.minesweeperproyectoi;

/**
 * Nodo #4.
 */
public class Node4 {
    private int x;
    private int y;
    private Node4 next;

    /**
     *
     * @param y
     * @param x
     * Constructor del Nodo #4.
     */
    public Node4(int y, int x) {
        this.y = y;
        this.x = x;
        this.next = null;
    }
    /**
     *get_(): getters de información.
     *set_(): setters de información.
     *is_(): getters de booleans.
     */
    public void setNext(Node4 next) {
        this.next = next;
    }

    public Node4 getNext() {
        return next;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
