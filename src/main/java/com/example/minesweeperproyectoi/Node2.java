package com.example.minesweeperproyectoi;

public class Node2 {
    private Object data;
    public Node2 next;
    public int x;
    public int y;
    public boolean bomb;

    public Node2(Object data, int x, int y, boolean bomb){
        this.next = null;
        this.data = data;
        this.x = x;
        this.y = y;
        this.bomb = bomb;
    }

    public boolean isBomb(){
        if (this.bomb == true){
            return true;
        }else{
            return false;
        }
    }

    public Object getData(){
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node2 getNext() {
        return next;
    }

    public void setNext(Node2 next) {
        this.next = next;
    }
}
