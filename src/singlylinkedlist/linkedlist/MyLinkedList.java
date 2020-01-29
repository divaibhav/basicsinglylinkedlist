/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 29-Jan-20
 *  Time: 3:33 AM
 */
package singlylinkedlist.linkedlist;

import singlylinkedlist.node.Node;

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

    //a method to insert node in the beginning of linked list
    // i.e. insert at head or addFirst
    public void insertAtBeginning(int data) {
        //creating node
        Node node = new Node(data);
        //setting the next reference of node to refer to head or start of list
        node.setNext(head);
        // setting the head to refer node
        head = node;
    }

    // a method to delete node from the list
    // this method will delete the last inserted node
    //this method will return data of deleted node
    public int delete() {
        int response = 0;
        // checking if list contain any node
        if (head != null) {
            // to delete the last node, we have to reach the second last node, and set its next node reference to null
            // assigning head to temp
            Node temp = head;
            // to store reference of previous node, we will use this node to delete last node by setting its next node as null
            Node previous = null;
            while (temp.getNext() != null) {
                previous = temp;
                // updating temp
                temp = temp.getNext();
            }
            // getting data from last node
            response = temp.getData();
            // now previous is pointing to second last node
            previous.setNext(null);
        }
        return response;
    }

    // a method to search data in the list, this method will return true if Node having given data found else false
    public boolean search(int data) {
        boolean response = false;
        //traversing the linked list and will check each node for given data
        // assigning head to temp
        Node temp = head;
        while (temp != null) {
            // checking for data at each node
            if (temp.getData() == data) {
                response = true;
                break;
            }
            // updating temp
            temp = temp.getNext();

        }
        return response;
    }

    // a method to print the list
    public void printList() {
        //traversing the linked list and will print each node.
        // assigning head to temp
        System.out.println("Printing list");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData());
            // updating temp
            temp = temp.getNext();
            if (temp != null) {
                System.out.print("---->");
            }


        }
        System.out.println();
    }

}
