package arrays;
	
public class JaggedArray {

	public static void main(String[] args) {

		int[][] b = new int[2][];

		b[0] = new int[] { 10, 20 };
		b[1] = new int[] { 30 };

		for (int i = 0; i < b.length; i++) {

			for (int j = 0; j < b[i].length; j++) {

				System.out.print(b[i][j] + " ");

			}

			System.out.println("");

		}

	}

}
