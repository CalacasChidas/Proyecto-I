package com.example.minesweeperproyectoi;

import javafx.scene.control.Button;

public class Node {
    public Button data;
    public Node next, last;
    public int bomb;


    public Node(Button data){
        this.next = null;
        this.data = data;
        this.last = null;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public Button getData(){
        return this.data;
    }

    public void setData(Button data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}


