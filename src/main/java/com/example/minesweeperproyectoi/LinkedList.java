package com.example.minesweeperproyectoi;

public class LinkedList {
    private Node head;
    private int size;
    public LinkedList(){
        this.head = null;
        this.size = 0;
    }
    public int size(){
        return this.size;
    }
    public void insertFirst(Object data, int bomb){
        Node newNode = new Node(data, bomb);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
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
