package problem10;

public class Test1 {

	public static void main(String[] args) {
		long sum=0;
		for (int i = 1; i <= 10; i++) {
			int flag = 0;
			if (i >=2) {
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i%j==0) {
						flag = 1;
						break;
					}
				}
				if (flag==0) {
					sum+=i;
				}
			}
		}
		System.out.println(sum);
	}
}
