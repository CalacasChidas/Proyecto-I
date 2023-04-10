/**
 * Lista #2
 */
package com.example.minesweeperproyectoi;

import javafx.scene.control.Button;
public class Lista {
    private Node2 head;
    private int size;

    /**
     * Constructor de la lista #2
     */
    public Lista() {
        this.head = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    /**
     *
     * @param data Button
     * @param x int
     * @param y int
     * @param bomb boolean
     * @return void
     * insertFirst: Inserta un nodo al inicio de la lista, recibiendo los parámetros data, x y y (posición en la matrix) y la bomba.
     */
    public void insertFirst(Button data, int x, int y, boolean bomb) {
        Node2 newNode = new Node2(data, x, y, bomb);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }

    /**
     *
     * @param x int
     * @param y int
     * @return Node2
     * finMatrix: Busca una posición en la matrix recibiendo la posición en x y y. Retorna el nodo encontrado.
     */
    public Node2 finMatrix(int x, int y) {
        int contx = 0;
        int conty = 0;
        Node2 current = this.head;

            while (contx != x) {
                if (current.next.next.next.next.next.next.next.next == null) {
                    return null;
                }else {
                    current = current.next.next.next.next.next.next.next.next;
                    contx++;
                }
            }
            while (conty != y) {
                if (current.next == null) {
                    return null;
                }else {
                    current = current.next;
                    conty++;
                }

            }
            return current;
        }

    /**
     *
      * @param x int
     * @param y int
     * @return int
     * finMatrixNum: Este método busca un nodo en la lista y verifica si es null, si el nodo existe, retora 1 y si es null retorna 0,
     * esto con el fin de utilizar la función isBombBo y evitar que de error por tratar de añadir un null a una lista.
     */
    public int finMatrixNum(int x, int y) {
        int contx = 0;
        int conty = 0;
        Node2 current = this.head;

        while (contx != x) {
            if (current.next.next.next.next.next.next.next.next == null) {
                return 0;
            }else {
                current = current.next.next.next.next.next.next.next.next;
                contx++;
            }
        }
        while (conty != y) {
            if (current.next == null) {
                return 0;
            }else {
                current = current.next;
                conty++;
            }

        }
        return 1;
    }

    /**
     *
     * @param x int
     * @param y int
     * @return boolean.
     * isBombBo: primero revisa si el nodo en cuestión no es nulo, y si no lo es, devuelve un boolean de la Bomba del nodo.
     */
    public boolean isBombBo(int x, int y){
        if (finMatrixNum(x, y)!=0){
            return finMatrix(x, y).isBomb();
        }else{
            return false;
        }
    }

    /**
     *
     * @param list
     * @return int
     * hasBomb: recibe una lista con información de los vecinos de un botón y va contando la cantidad de bombas encontradas.
     * Retorna esa cantidad.
     */
    public int hasBomb(SimpleListwBomb list) {
        int cont = 0, index = 0, lim = list.getSize();
        while (index != lim) {
            if (list.find(index).getBomb()) {
                cont++;
                index++;
            } else {
                index++;
            }
        }
        return cont;
    }

    /**
     *
     * Parámetros: x y y, ambos int.
     * Retorna: Método hasBomb (int)
     * neightborsFind: recibe sus parámetros y crea una lista con los vecinos del botón seleccionado.
     * bbb
     * bxb
     * bbb
     * Retorna las "b" en una lista que es evaluada por la función isBombBo.
     */
    public int neightborsFind(int x, int y) {
        SimpleListwBomb neightbours = new SimpleListwBomb();
        neightbours.insertFirst(finMatrixNum(x-1,y-1),isBombBo(x-1,y-1));
        neightbours.insertFirst(finMatrixNum(x-1,y),isBombBo(x-1,y));
        neightbours.insertFirst(finMatrixNum(x-1,y+1),isBombBo(x-1,y+1));
        neightbours.insertFirst(finMatrixNum(x,y-1),isBombBo(x,y-1));
        neightbours.insertFirst(finMatrixNum(x,y+1),isBombBo(x,y+1));
        neightbours.insertFirst(finMatrixNum(x+1,y-1),isBombBo(x+1,y-1));
        neightbours.insertFirst(finMatrixNum(x+1,y),isBombBo(x+1,y));
        neightbours.insertFirst(finMatrixNum(x+1,y+1),isBombBo(x+1,y+1));
        return hasBomb(neightbours);
        }


    /**
     * Parámetros: Ningundo
     * Retorna: void
     * displayinmatrix: Este método imprime en forma de matrix la lista utilizada. Toma un valor x y un valor y y acomoda la matrix
     * dependiendo de su posición de forma [x, y]. Además, pone un * en las celdas donde se encuentra una mina. *[x, y].
     * */

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



