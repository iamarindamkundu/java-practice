package sorting;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = {12, 13, 4, 2, 1, 8};
		quickSort(a, 0, a.length - 1);
		System.out.println("Sorted array : ");
		display(a);
	}

	private static void display(int[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}

	private static void quickSort(int[] a, int low, int high) {

		if (low < high) {
			int pivot = partition (a, low, high);
			quickSort(a, low, pivot - 1);
			quickSort(a, pivot + 1, high);
		}
	}

	private static int partition(int[] a, int low, int high) {

		int left, right, pivot = a[low];
		left = low;
		right = high;
		while(left < right) {
//			move left if item <= pivot
			while (a[left] <= pivot)
				left++;
//			move right if item > pivot
			while (a[right] > pivot)
				right--;
			
			if (left < right)
				swap(a, left, right);
		}
//		right is final position for pivot
		a[low] = a[right];
		a[right] = pivot;
		return right;
	}

	private static void swap(int[] a, int left, int right) {
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}
}
