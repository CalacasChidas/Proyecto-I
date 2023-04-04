package com.example.minesweeperproyectoi;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size(){
        return this.size;
    }
    public void insertFirst(Object data){
        Node newNode = new Node(data);
        if (this.head==null){
            this.head = this.tail = newNode;
        }else{
            newNode.setNext(this.head);
            this.head.setLast(newNode);
            newNode.setLast(null);
            this.head = newNode;
        }
        this.size++;
    }
    public Node deleteLast(){
        if(this.head != null){
            Node temp = this.tail;
            this.tail = this.tail.last;
            this.size--;
            return temp;
        }else{
            return null;
        }
    }

    public Node deleteFirst(){
        if(this.head != null){
            Node temp = this.head;
            this.head = this.head.next;
            this.size--;
            return temp;
        }else{
            return null;
        }
    }
    public Object getLast(){
        return tail;
    }
    public void displayinmatrix() {
        Node current = this.head;
        int cont = 0;
        while (current != null) {
            if (cont != 8) {
                System.out.print(current.getData() + "," + " ");
                cont++;
                current = current.getNext();
            } else {
                System.out.println(" ");
                System.out.println(" ");
                cont = 0;
            }
        }
    }
}


