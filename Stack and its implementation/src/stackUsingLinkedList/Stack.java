/*
 * Stack implementation using linked list. This type of implementation has no overflow condition.
 * Stack can grow and shrink as and when needed.*/


package stackUsingLinkedList;

import java.util.Scanner;

public class Stack {

	static Stack top;
	int data;
	Stack nextLink;
	Stack() {
		top = null;
	}
	Stack(int x) {
		this.data = x;
		this.nextLink = null;
	}
	void push(int x) {
		Stack node = new Stack(x);
		if (top==null) {
			top = node;
		}
		else {
			node.nextLink = top;
			top = node;
		}
	}
	int pop() {
		if (top == null) {
			System.out.println("Stack is underflow");
			return Integer.MAX_VALUE;
		}
		else {
			int item = top.data;
			Stack temp = top.nextLink;
			top.nextLink = null;
			top = temp;
			return item;
			
		}
	}
	boolean isEmpty() {
		if (top == null)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Stack mystack = new Stack();
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		do{
			System.out.println("********************\n"
					+ "Enter your choice:\n"
					+ "Enter 1 to push item into stack:\n"
					+ "Enter 2 to pop item from stack:\n"
					+ "Enter 3 to check stack:\n"
					+ "Enter 4 to display stack:\n"
					+ "Enter 5 to check the top of stack:\n"
					+ "Enter 0 to exit:\n"
					+ "***********************");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the item:");
				mystack.push(sc.nextInt());
				break;
			case 2:
				int item = mystack.pop();
				if (item!=Integer.MAX_VALUE) {
					System.out.println("Item poped:" + item);
				}
				break;
			case 3:
				if (mystack.isEmpty())
					System.out.println("Stack is empty.");
				else
					System.out.println("Stack is not empty");
				break;
			case 4:
				if (mystack.isEmpty()) {
					System.out.println("Nothing to diaplsy.....Stack is empty....");
				}
				else {
					mystack.display();
				}
				break;
			case 5:
				if (mystack.isEmpty()) {
					System.out.println("Stack is empty...top of stack contains nothing.");
				}
				else {
					System.out.println("Top of stack data:" + top.data);
				}
				break;
			case 0:
				System.out.println("Thank you...");
				break;
			default:
				System.out.println("WRONG INPUT:TRY AGAIN");
			}
		}while(choice != 0);
		sc.close();
	}
	private void display() {
		Stack temp = top;
		System.out.println("Items inside the stack:");
		while (temp != null) {
			System.out.printf("\t| %d |\n", temp.data);
			System.out.println("\t------");
			temp=temp.nextLink;
		}
	}
}
