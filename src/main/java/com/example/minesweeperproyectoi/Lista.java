package com.example.minesweeperproyectoi;

public class Lista {
    private Node2 head;
    private int size;
    public Lista(){
        this.head = null;
        this.size = 0;
    }
    public Node2 find(int pos){
        int cont = 0;
        Node2 current = this.head;
        while (cont != pos){
            current = current.next;
        }return current;
    }
    public int size(){
        return this.size;
    }
    public void insertFirst(Object data, int x, int y, boolean bomb){
        Node2 newNode = new Node2(data, x, y, bomb);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }
    public Node2 deleteFirst(){
        if(this.head != null){
            Node2 temp = this.head;
            this.head = this.head.next;
            this.size--;
            return temp;
        }else{
            return null;
        }
    }

    public Node2 finMatrix(int x, int y){
        int contx = 0;
        int conty = 0;
        Node2 current = this.head;
        while (contx != x){
            current = current.next.next.next.next.next.next.next.next;
            contx++;
        }while(conty != y){
            current = current.next;
            conty++;
        }System.out.println(current.getData());
        return current;
    }
    public void displayinmatrix2() {
        Node2 current = this.head;
        int cont = 0;
        if(this.head == null){
            System.out.println("Nula");
        }else {
            while (current != null) {
                if (cont != 8) {
                    if (current.bomb) {
                        System.out.print("*"+"[" + current.x + "," + " " + current.y + "]" + "," + " ");
                        cont++;
                        current = current.next;
                    }else{
                        System.out.print("[" + current.x + "," + " " + current.y + "]" + "," + " ");
                        cont++;
                        current = current.next;
                    }
                } else {
                    System.out.println(" ");
                    System.out.println(" ");
                    cont = 0;
                }
            }
        }
    }
}



