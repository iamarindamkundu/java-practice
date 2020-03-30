package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = {12, 3, 8, 2, 11};
		System.out.println("Sorted array: ");
		sort(a);
	}

	private static void sort(int[] a) {

		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min_idx]) 
					min_idx=j;
			}
			
			int temp = a[min_idx];
			a[min_idx] = a[i];
			a[i] = temp;
		}
		display(a);
	}

	private static void display(int[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}
}
