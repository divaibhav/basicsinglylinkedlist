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

    //a method to insert a node in the list
    // this method will add node at the end of linked list
    public void insert(int data) {
        // creating node
        Node node = new Node(data);
        // checking if list is empty, if the list is empty we will insert node at head
        if (head == null) {
            head = node;
        } else {
            // assigning head to a temp node, to travers the list and insert node at the end
            Node temp = head;
            // a loop to reach end of linked list
            while (temp.getNext() != null) {
                // if the next node is available, updating temp to refer next node
                temp = temp.getNext();
            }
            // now temp is referring to last node of the list
            temp.setNext(node);
        }
    }
}
