/*
 * This program will evaluate a postfix expression using stack.
 * */

package evaluatePostfix;

import java.util.Stack;

public class EvalPostfix {

	public static void main(String[] args) {
		String exp = "231*+30-";
		System.out.println(evaluatePostfix(exp));
	}

	private static int evaluatePostfix(String exp) {

//		create a stack
		Stack<Integer> stack = new Stack<Integer>();
		
//		scan all character one by one
		for (int i = 0; i < exp.length(); i++) {
			
			char c = exp.charAt(i);
//			if the scan character is an operand (i.e. number)
//			push it into stack
			if (Character.isDigit(c))
				stack.push(c - '0');
//			if the scan character is an operator pop two character from the stack
//			apply the operator on it and store the result.
			else {
				int v1 = stack.pop();
				int v2 = stack.pop();
				
				switch(c){
				case '+':
					stack.push(v2+v1);
					break;
				case '-':
					stack.push(v2-v1);
					break;
				case '*':
					stack.push(v2*v1);
					break;
				case '/':
					stack.push(v2/v1);
					break;
				}
			}
		}
		return stack.peek();
	}
}
