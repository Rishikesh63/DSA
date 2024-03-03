package LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to insert a new node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to delete nodes with values greater than 25
    public void deleteNodesGreaterThan25() {
        Node current = head;
        Node prev =null;

        while (current != null) {
            if (current.data > 25) {
                // If the node has a value greater than 25, delete it
                if (prev != null) {
                    prev.next = current.next;
                } else {
                    // If the head node has a value greater than 25, update the head
                    head = current.next;
                }
            } else {
                // Move to the next node
                prev = current;
            }

            // Move to the next node
            current = current.next;
        }
    }

    // Method to display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a linked list and take input from the user
        LinkedList linkedList = new LinkedList();
        System.out.println("Enter elements for the linked list (enter a non-numeric value to stop):");
        while (scanner.hasNextInt()) {
            int element = scanner.nextInt();
            linkedList.insert(element);
        }

        // Display the original linked list
        System.out.println("Original Linked List:");
        linkedList.display();

        // Delete nodes with values greater than 25
        linkedList.deleteNodesGreaterThan25();

        // Display the modified linked list
        System.out.println("Linked List after deleting nodes with values greater than 25:");
        linkedList.display();
        scanner.close();
    }
}
