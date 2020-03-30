package problem5;

public class Test1 {

	public static void main(String[] args) {
		int num;
		for (int i = 1; true; i++) {
			if (divisibilityTest(i)) {
				num = i;
				break;
			}
		}
		System.out.println(num);
	}

	private static boolean divisibilityTest(int a) {

		for (int i = 1; i <= 20; i++) {
			if (a % i != 0)
				return false;
		}
		return true;
	}
}
