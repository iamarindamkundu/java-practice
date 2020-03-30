package algorithmic_crush;

import java.util.Scanner;

public class Solution {
	static void displayArr(int arr[]){
		System.out.println("\nArray Element:\n");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+"  ");
		}
	}
	static int[] incrementArray(int[] arr, int[] opt){
		//System.out.println("in\n\n");
		for(int i = opt[0] - 1; i <= opt[1] - 1; i++){
			//System.out.println(arr[i]);
			arr[i] += opt[2];
		}
		return arr;
	}
	
	static int findMax(int[] arr, int max){
		for(int i = 0; i < arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}
	static void display2D(int[][] opt){
		for(int i=0;i<opt.length;i++){
			for(int j=0;j<opt[0].length;j++){
				System.out.print(opt[i][j]+"  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] opt = null;
		int aSize = sc.nextInt();
		int nOpt = sc.nextInt();
		opt = new int[nOpt][3];
		for(int i=0;i<opt.length;i++){
			for(int j=0;j<opt[0].length;j++){
				opt[i][j] = sc.nextInt();
			}
		}
		int[] arr = new int[aSize];
		//displayArr(arr);
		int max = 0;
		for(int i = 0; i < nOpt; i++){
			max = findMax(incrementArray(arr, opt[i]), max);
		}
		//display2D(opt);
		System.out.println(max);
	}

}
