package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {12, 3, 11, 1, 9, 15};
		System.out.println("Sorted array :");
		sort(a);
	}

	private static void sort(int[] a) {

		int n = a.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		display(a);
	}

	private static void display(int[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}
}
