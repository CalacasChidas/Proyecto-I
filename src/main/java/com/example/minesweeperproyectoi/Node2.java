/**
 * Node #2
 */
package com.example.minesweeperproyectoi;

import javafx.scene.control.Button;
//Node2
public class Node2 {
    private Button data;
    public Node2 next;
    public int x;
    public int y;
    public boolean bomb;
    public boolean flag;
    public boolean open;

    /**
     *
     * @param data
     * @param x
     * @param y
     * @param bomb
     * Constructor del Nodo #2
     */
    public Node2(Button data, int x, int y, boolean bomb){
        this.next = null;
        this.data = data;
        this.x = x;
        this.y = y;
        this.bomb = bomb;
        this.flag = false;
        this.open = false;
    }

    /**
     *get_(): getters de información.
     *set_(): setters de información.
     *is_(): getters de booleans.
     */
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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
    }

    public Button getData(){
        return this.data;
    }

    public void setData(Button data) {
        this.data = data;
    }

    public Node2 getNext() {
        return next;
    }

    public void setNext(Node2 next) {
        this.next = next;
    }
}
