package com.example.minesweeperproyectoi;

public class Node {
    public Object data;
    public Node next, last;
    public int bomb;


    public Node(Object data){
        this.next = null;
        this.data = data;
        this.last = null;
    }

    public void setLast(Node last) {
        this.last = last;
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


