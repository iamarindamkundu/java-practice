//merge sort time complexity is O(nlogn)

package sorting;

public class MergeSort {

	public static void main(String[] args) {
		int a[] = {12,11, 3, 4, 7, 13 };
		System.out.println("Sorted array: ");
		margeSort(a, 0, a.length-1);
		display(a);
	}

	private static void display(int[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}

	private static void margeSort(int[] a, int l, int r) {

		if (l < r) {
//			middle index of l and r
			int m = l + (r-l)/2;
			
			margeSort(a, l, m);
			margeSort(a, m + 1, r);
			marge(a, l, m, r);
		}
	}

	private static void marge(int[] a, int l, int m, int r) {

		int i,j,k;
		int n1 = m - l + 1;
		int n2 = r-m;
		
//		create temp array
		int L[] = new int[n1], R[] = new int[n2];
		
//		copy data to temp array
		for (i = 0; i < n1; i++)
			L[i] = a[l+i];
		for (j = 0; j < n2; j++)
			R[j] = a[m+1+j];
		
//		merge the temp array into a[l...r]
		i = 0; // initial index of first subarray
		j = 0; // initial index of second subarray
		k = l; // initial index of merged subarray
		while(i < n1 && j < n2) {
			if (L[i] <= R[j]) 
				a[k++] = L[i++];
			else
				a[k++] = R[j++];
		}
		
//		copy the remaining element of L into merged array, if present any
		while(i < n1)
			a[k++]=L[i++];
//		copy the remaining element of R into merged array, if present any
		while(j < n2)
			a[k++]=R[j++];
	}
}
