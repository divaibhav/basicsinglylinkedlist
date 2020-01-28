/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 29-Jan-20
 *  Time: 3:33 AM
 */
package singlylinkedlist;

public class MyLinkedList {
    // declaring head
    // to store reference of firstnode
    Node head;

    // constructor to initialize linked list
    public MyLinkedList() {
        // when the linked list is created head will refer to null
        head = null;
    }

    // to get start of list
    public Node getHead() {
        return head;
    }

}
