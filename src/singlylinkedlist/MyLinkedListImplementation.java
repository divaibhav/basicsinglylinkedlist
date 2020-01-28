/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 29-Jan-20
 *  Time: 4:12 AM
 */
package singlylinkedlist;

import java.util.Scanner;

public class MyLinkedListImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyLinkedList linkedList = new MyLinkedList();
        // a loop to add data in the lst
        System.out.println("enter 5 integers");
        for (int i = 0; i < 5; i++) {
            int data = sc.nextInt();
            // calling insert function to insert data
            linkedList.insert(data);

        }
        // calling printList method to print list
        linkedList.printList();
        System.out.println("deleting last node");
        int deletedNode = linkedList.delete();
        System.out.println(deletedNode);
        linkedList.printList();

    }
}
