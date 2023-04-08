package com.example.minesweeperproyectoi;

public class Node2 {
    private Object data;
    public Node2 next;
    public int x;
    public int y;
    public boolean bomb;
    public boolean flag;
    public boolean open;

    public Node2(Object data, int x, int y, boolean bomb){
        this.next = null;
        this.data = data;
        this.x = x;
        this.y = y;
        this.bomb = bomb;
        this.flag = false;
        this.open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isFlag() {
        return flag;
    }

    public boolean isBomb(){
        if (this.bomb == true){
            return true;
        }else{
            return false;
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
        System.out.println(this.flag);
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
