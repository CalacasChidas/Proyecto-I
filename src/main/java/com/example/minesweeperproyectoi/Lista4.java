package com.example.minesweeperproyectoi;

import java.util.concurrent.ThreadLocalRandom;

public class Lista4 {
    private Node4 head;
    int size;

    public Lista4() {
        this.head = head;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void insertFirst(int x, int y){
        Node4 newNode = new Node4(x, y);
        if (this.head==null){
            this.head = newNode;
        }else{
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.size++;
    }
    public Node4 random(){
        int random = (int) (Math.random() * ((this.size)-1));
        return delete(random);
    }

    public Node4 getHead() {
        return head;
    }

    public Node4 find(int x){
        int cont = 0;
        Node4 current = this.head;
        while (cont != x){
            current = current.getNext();
            cont++;
        }return current;
    }
    public Node4 delete(int x){
        Node4 current = this.head;
        Node4 previous = this.head;
        int cont = 0;
        while (current!= null){
            if(x == cont){
                if (current == this.head){
                    this.head = this.head.getNext();
                }else{
                    previous.setNext(current.getNext());
                }return current;
            }else{
                previous = current;
                current = current.getNext();
                cont++;
            }
        }return current;
    }

    public String deleteFirst() {
        if(this.head != null ){
            if(this.head.getNext()== null){
                String x = ("["+Integer.toString(this.head.getX())+","+" "+Integer.toString(this.head.getY())+"]");
                this.head = null;
                return x;
            }else{
                this.head = this.head.getNext();
                return ("["+Integer.toString(this.head.getX())+","+" "+Integer.toString(this.head.getY())+"]");
            }
        }else {
            return "Vacío";
        }
    }

}
