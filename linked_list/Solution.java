package linked_list;

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {	
    public static void display(Node head) {
        Node start = head;
        System.out.println("display");
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
    public static  Node insert(Node head,int data) {
        //Complete this method
        Node newNode = new Node(data);
        Node headCopy = head;
        if(head==null){
            head=newNode;
            headCopy=head;
        }
        else{
            while(head.next!=null){
                head=head.next;
            }
            head.next=newNode;
        }
        return headCopy;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}