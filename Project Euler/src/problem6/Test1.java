/*The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers 
and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * */

package problem6;

public class Test1 {

	public static void main(String[] args) {
		int sum1 = 0, sum2 = 0, sq;
//		find sum of squares
		for (int i = 1; i <= 100; i++) {
			sum1+= i*i;
		}
		System.out.println("Sum of squares of first 100 numbers:" + sum1);
		
//		find square of sum
		for (int i = 1; i <= 100; i++) {
			sum2+= i;
		}
		sq = sum2*sum2;
		System.out.println("Square of sum of first 100 numbers:" + sq);
		System.out.println("Difference is : " + Math.abs(sq-sum1));
	}
}
