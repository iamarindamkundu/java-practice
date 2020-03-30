import java.util.Scanner;

public class BracketBalancing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.printf("%s is %s:", str, checkBalance(str));
		sc.close();
	}

	private static Object checkBalance(String str) {
		
		char arr[] = str.toCharArray(), stack[];
		int i = 0, top = -1;
		stack = new char[20];
		while (i < arr.length) {
			if (arr[i] == ')' && top == -1) {
				return "Not Balanced";
			}
			else if (arr[i] == ')') {
				top--;
				i++;
			}
			else {
				stack[++i] = '(';
				top++;
			}
		}
		if (top != -1)
			return "Not Balanced";
		else
			return "Balanced";
	}
}
