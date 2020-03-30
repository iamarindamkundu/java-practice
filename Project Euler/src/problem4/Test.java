package problem4;

public class Test {

	public static void main(String[] args) {
		int num, flag = 0;
		for (int i = 10; i < 99; i++) {
			for (int j = 10; i < 99; j++) {
				if (isPalindrom(i*j)) { 
					num = i*j;
					System.out.println(num);
					flag = 1;
					break;
				}
			}
			if (flag == 1) {
				break;
			}
		}
	}

	private static boolean isPalindrom(int i) {

		int reverse=0, num = i;
		System.out.println(num);
		while(i != 0) {
			reverse = reverse*10 + i % 10;
			i/=10;
		}
		System.out.println(reverse);
		if (reverse == num)
			return true;
		return false;
	}
}
