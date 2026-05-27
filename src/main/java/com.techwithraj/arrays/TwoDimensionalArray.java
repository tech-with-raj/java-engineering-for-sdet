package arrays;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int[][] input = new int[2][2];
		
		input[0][0]= 100;
		input[0][1]= 200;
		input[1][0]= 300;
		input[1][1]= 400;
		

		for (int i = 0; i < input.length; i++) {

			for (int j = 0; j < input[0].length; j++) {

				System.out.print(input[i][j] + " ");

			}

			System.out.println("");

		}
		
		System.out.println(Arrays.toString(input[0]));
		System.out.println(Arrays.toString(input[1]));

	}

}
