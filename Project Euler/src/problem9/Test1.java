/* 
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2 
 * For example, 32 + 42 = 9 + 16 = 25 = 52. 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. 
 * Find the product abc.
 * */

package problem9;

public class Test1 {

	public static void main(String[] args) {
		for (int i = 1; i<1000; i++) {
			for (int j = i+1; j < 1000; j++) {
				for (int k = j+1; k < 1000; k++) {
					if (isTriplet(i,j,k) && (i+j+k) == 1000)
						System.out.println(i*j*k);
				}
			}
		}
	}
	
	private static boolean isTriplet(int a, int b, int c) {
		if (c*c == (a*a + b*b))
			return true;
		else 
			return false;
	}
}
