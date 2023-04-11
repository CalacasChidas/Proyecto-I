package com.example.minesweeperproyectoi;

public class Stack {
    private Lista4 list;

    public Stack() {
        this.list = new Lista4();
    }

    public void push(int x, int y){
        this.list.insertFirst(x, y);
    }
    public int isEmpty(){
        if(list.getSize()==0){
            return 0;
        }else{
            return 1;
        }
    }
    public String pop(){
        return this.list.deleteFirst();
    }
}
