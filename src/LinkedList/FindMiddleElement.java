package LinkedList;

/**
 * GFG: Finding middle element in a linked list 
 * Easy
 * 12 June 2022
 * https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1/#
 * 
 */
// { Driver Code Starts
import java.util.Scanner;
import java.io.*;

/* class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }

} */

class FindMiddleElement {
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for (int i = 0; i < n - 1; i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            int ans = getMiddle(head);
            System.out.println(ans);
            // printList(head);
            t--;
        }
        sc.close();
    }
    static int getMiddle(Node head) {
        // Your code here.
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
// } Driver Code Ends

/*
 * Node of a linked list
 * class Node {
 * int data;
 * Node next;
 * Node(int d) { data = d; next = null; }
 * }
 */

    
