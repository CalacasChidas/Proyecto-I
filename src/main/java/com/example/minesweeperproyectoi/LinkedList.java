/**
 * Lista #1
 */
package com.example.minesweeperproyectoi;

import javafx.scene.control.Button;
public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    /**
     * Constructor de la Lista #1.
     */
    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size(){
        return this.size;
    }
    /**
     *
     * @param data Buttom
     * @return void
     * insertFirst: Inserta un nodo al inicio de la lista, recibiendo los parámetros data.
     */
    public void insertFirst(Button data){
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
    /**
     * Parámetros: Ningundo
     * Retorna: void
     * displayinmatrix: Este método imprime en forma de matrix la lista utilizada. Toma un valor x y un valor y y acomoda la matrix
     * dependiendo de su posición de forma [x, y]. Además, pone un * en las celdas donde se encuentra una mina. *[x, y].
     * */
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

    /**
     *
     * @param x
     * @return Node current.
     * find(): Busca en la lista el nodo en posición x (no lo busca como matrix si no como lista enlazada sencilla).
     * Retorna el nodo encontrado.
     */
    public Node find(int x){
        int cont = 0;
        Node current = this.head;
        while (cont != x){
            current = current.next;
            cont++;
        }return current;
    }
    /**
     *
     * @param x int
     * @param y int
     * @return Node2
     * finMatrix: Busca una posición en la matrix recibiendo la posición en x y y. Retorna el nodo encontrado.
     */
    public Node finMatrix(int x, int y){
        int contx = 0;
        int conty = 0;
        Node current = this.head;
        while (contx != x){
            current = current.next.next.next.next.next.next.next.next;
            contx++;
        }while(conty != y){
            current = current.next;
            conty++;
        }return current;
    }
}


