/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 29-Jan-20
 *  Time: 3:27 AM
 */
package singlylinkedlist;

public class Node {
    // to store integer value
    private int data;
    // to store reference of next node
    private Node next;

    // constructor to create node for linked list and initialize it data and next as null
    public Node(int data) {
        this.data = data;
        next = null;
    }

    //getter to get data
    public int getData() {
        return data;
    }

    // a setter to set data
    public void setData(int data) {
        this.data = data;
    }

    // getter to get next node
    public Node getNext() {
        return next;
    }

    // setter to set next node
    public void setNext(Node next) {
        this.next = next;
    }
}
