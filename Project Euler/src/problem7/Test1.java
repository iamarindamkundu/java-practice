/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 * */

package problem7;

public class Test1 {

	public static void main(String[] args) {
		int count = 0, num=0;
		for (int i = 1; count<10001; i++) {
			int flag = 0;
			if (i >= 2) {
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i%j==0) {
						flag = 1;
						break;
					}
				}
				if (flag==0) {
					count++;
					num = i;
				}
			}
		}
		System.out.println("Count:" + count +" Number:" +num);
	}
}
