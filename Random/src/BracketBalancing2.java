import java.util.Scanner;

public class BracketBalancing2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.printf("%s is %s", str, isBalanced(str));
		sc.close();
	}

	private static Object isBalanced(String str) {
		
		char ch[] = str.toCharArray();
		char stack[] = new char[20];
		int i = 0, top = -1;
		while(i < ch.length) {
			if ((ch[i] == ')' || ch[i] == '}' || ch[i] == ']') && top == -1) {
				return "Not Balanced.";
			}
			else if ((ch[i] == ')' && stack[top] == '(') || (ch[i] == '}' && stack[top] == '{') || (ch[i] == ']' && stack[top] == '[')) {
					i++; 
					top-- ;
			}
			else if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
				stack[++top] = ch[i];
				i++;
			}
			else {
				return "Not Balanced";
			}
		}
		if (top != -1) {
			return "Not Balanced";
		}
		else 
			return "Balanced";
	}
}
