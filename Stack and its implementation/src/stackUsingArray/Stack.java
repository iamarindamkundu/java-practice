/*
 * This is a stack implementation using array. Stack using array is easy to implement.
 * However, array implementation of stack has disadvantages like it doesn't grow or shrink 
 * depending on needs at runtime.
 * */


package stackUsingArray;

import java.util.Scanner;

public class Stack {

	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];
	
	Stack() {
		top = -1;
	}
//	basic operation 1
	boolean isEmpty() {
		return (top < 0);
	}
//	basic operation 2
	void push(int x) {
		if (top >= MAX) {
			System.out.println("Stack Overflow");
		}
		else {
			a[++top] = x;
		}
	}
//	basic operation 3
	int pop() {
		if (top < 0) {
			System.out.println("Stack underflow");
			return Integer.MAX_VALUE;
		}
		else {
			int x = a[top--];
			return x;
		}
	}
	
	public static void main(String args[]) {
		Stack mystack = new Stack();
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		do {
			System.out.println("********************\n"
					+ "Enter your choice:\n"
					+ "Enter 1 to push element:\n"
					+ "Enter 2 to pop element:\n"
					+ "Enter 3 to check stack:\n"
					+ "Enter 4 to display stack:\n"
					+ "Enter 0 to exit:\n"
					+ "**********************\n");
			choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.println("Enter the element:");
				mystack.push(sc.nextInt());
			}
			else if (choice == 2) {
				int item = mystack.pop();
				if (item != Integer.MAX_VALUE)
					System.out.println("Item poped:"+ item);
			}
			else if (choice == 3) {
				if (mystack.isEmpty())
					System.out.println("Stack is empty.");
				else
					System.out.println("Stack is not empty.");
			}
			else if (choice == 4) {
				if (mystack.isEmpty()) 
					System.out.println("Nothing to display....stack is empty....");
				else 
					mystack.display();
			}
			else if (choice == 0) {
				System.out.println("Thank you...");
			}
			else {
				System.out.println("WRONG INPUT::TRY AGAIN");
			}
		}while(choice != 0);
		sc.close();
	}
	private void display() {
		System.out.println("Items inside the stack:\n");
		for (int i = top; i >= 0; i--) {
			System.out.printf("\t| %d |\n", a[i]);
			System.out.print("\t------\n");
		}
	}
}
