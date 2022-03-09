
public class Matrix {

	public static void main(String[] args) {

		int[][] matrix = new int[6][6];
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[r].length; c++) {
				matrix[r][c] = (int) (Math.random() * 10 + 1);
			}
		}
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[r].length; c++) {
				System.out.print(matrix[r][c] + " ");
			}
			System.out.println();
		}

		System.out.println(findSmallest(matrix));
	}

	public static int findSmallest(int[][] numbers) {
		int smallest = numbers[0][0];
		for (int r = 0; r < numbers.length; r++) {
			for (int c = 0; c < numbers[r].length; c++) {
				if (numbers[r][c] < smallest)
					smallest = numbers[r][c];
			}
		}

		return smallest;

	}

}
