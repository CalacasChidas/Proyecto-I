package com.example.minesweeperproyectoi;

public class Node4 {
    private int x;
    private int y;
    private Node4 next;

    public Node4(int y, int x) {
        this.y = y;
        this.x = x;
        this.next = null;
    }

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
