public class AllSubsetsOfArray {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4};
		printSubsets(a);
	}

	private static void printSubsets(int a[]) {
		int n = a.length;

		for (int i = 0; i < (1 << n); i++) {
			System.out.print("{ ");

			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) > 0)
					System.out.print(a[j] + " ");
			}
			System.out.println("}");
		}
	}
}