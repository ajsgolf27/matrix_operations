package matrix_operations;

public class Operations extends matrix {

	public Operations(int rows, int columns) {
		super(rows, columns);

	}

	public int trace() {
		int traceAmount = 0;
		for (int i = 0; i < rowSize; i++) {
			traceAmount += matrix[i][i];

		}
		System.out.println(traceAmount);
		return traceAmount;
	}

	public int[][] transpose() {
		int[][] temp = new int[rowSize][columnSize];
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				temp[i][j] = matrix[j][i];
			}
		}

		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				matrix[i][j] = temp[i][j];
			}
		}

		return matrix;

	}

	public void scalar(double scalar, int[][] matrix) {
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				matrix[i][j] *= scalar;
			}
		}

	}

	public int[][] add(int[][] matrix1, int[][] matrix2) {
		
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				matrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return matrix;

	}

	public int[][] subtract(int[][] matrix1, int[][] matrix2) {
		int[][] returnedMatrix = new int[rowSize][columnSize];
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				returnedMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}
		return returnedMatrix;
	}

	public void multiply() {

	}
	
	public int[][] passMatrix(){
		return matrix;
		
	}
}
