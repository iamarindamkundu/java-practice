package strange_counter;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		BigInteger value = findValueAtTime(time);
		System.out.println(value);
		sc.close();
	}

	private static BigInteger findValueAtTime(int time) {

		BigInteger v = new BigInteger(3 + "");
		BigInteger init = new BigInteger(3 + "");
//		int v = 3;
//		int init = 3;
		for (BigInteger i = new BigInteger(1 + ""); i.compareTo(new BigInteger(time + "")) == -1; i = i.add(new BigInteger(1 + ""))) {
			if (v.compareTo(new BigInteger(0 + "")) == 0) {
				init = init.multiply(new BigInteger(2 + ""));
				init = v;
				v = v.subtract(new BigInteger(1 + ""));
			}
			else {
				v = v.subtract(new BigInteger(1 + ""));
			}
		}
		return v.add(new BigInteger(1 + ""));
	}
}
