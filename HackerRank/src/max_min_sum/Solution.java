package max_min_sum;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long arr[] = new long[5];
        arr[0] = a;
        arr[1] = b;
            arr[2] = c;
            arr[3] = d;
            arr[4] = e;
        arr = sortArray(arr);
        long min = findMin(arr);
        long max = findMax(arr);
        System.out.print(min+" "+max);
        in.close();
    }
    
    static private long[] sortArray(long[] a) {
        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - i -1; j++) {
                if (a[j] > a[j + 1]) {
                    long swap = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = swap;
                }
        }
        return a;
    }
    
    static private long findMin(long arr[]) {
        long sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    static private long findMax(long arr[]) {
        long sum = 0;
        for (int i = 1; i < 5; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
