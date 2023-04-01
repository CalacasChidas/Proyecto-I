package com.example.minesweeperproyectoi;

public class Node {
    private Object data;
    public Node next;
    public int bomb;

    public Node(Object data, int bomb){
        this.next = null;
        this.data = data;
        this.bomb = bomb;
    }

    public Object getData(){
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
