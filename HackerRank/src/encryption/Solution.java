package encryption;

import java.util.Scanner;

public class Solution {

	static void display(char[][] mat){
		// System.out.println("Your message:");
		for(int i = 0; i < mat[0].length; i++){
			for(int j = 0; j < mat.length; j++){
				System.out.print(mat[j][i]);
			}
			System.out.print(" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int row = (int) Math.floor(Math.sqrt(str.length()));
		int col = (int) Math.ceil(Math.sqrt(str.length()));
		while(row*col<str.length()){
			if(row<col)
				row++;
			else
				col++;
		}
		// System.out.println("Row:"+row+"\nCol:"+col);
		char[][] mat = new char[row][col];
		char[] strarr = str.toCharArray();
		int k = 0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++){
				if( k < strarr.length){
					mat[i][j] = strarr[k++];
				}
				else{
					break;
				}
			}
		}
		display(mat);
		sc.close();
	}
}
