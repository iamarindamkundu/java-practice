/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * */

package problem1;

public class Test {

	public static void main(String[] args) {
		int sum_of_3 = 0, sum_of_5 = 0;
		int i;
		for (i = 1; i*3<1000; i++)
			sum_of_3 += i*3;
		System.out.println("sum of 3 : " + sum_of_3);
		
		for (i = 1; i*5<1000; i++)
			sum_of_5+= i*5;
		System.out.println("Sum of 5 : "+ sum_of_5);
		System.out.println("The Sum of all the multiples of 3 or 5 below 1000 : " + (sum_of_3+sum_of_5));
	}
}
