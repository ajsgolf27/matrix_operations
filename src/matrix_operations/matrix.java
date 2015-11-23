package matrix_operations;

public class matrix {
	protected int[][] matrix;
	protected int rowSize = 0;
	protected int columnSize = 0;
	public matrix(int rows, int columns){
		rowSize = rows;
		columnSize = columns;
		matrix= new int[rows][columns];
	}

	public void addNumber(int rowNumber, int columnNumber, int numberToAdd){
		if(rowNumber <= rowSize || columnNumber <= columnSize)
			matrix[rowNumber][columnNumber] = numberToAdd;
	}

	public void print(){
		for(int[] i : matrix){
			for (int elem: i) {
				System.out.println(elem);
			}
			System.out.println("");
		}
	}


}
