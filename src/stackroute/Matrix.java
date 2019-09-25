package stackroute;

public class Matrix {
public int n_rows;
public int n_cols;
public int[][] matrix;
public Matrix(int n_r,int n_c,int[] m) {
	int count = 0;
	n_cols = n_c;
	n_rows = n_r;
	for(int i = 0;i < n_cols; i++) {
		for(int j = 0;j < n_rows; j++) {
			matrix[i][j] = m[count++];
		}
	}
	}
	public Matrix(int n_r,int n_c) {
		int count = 0;
		n_cols = n_c;
		n_rows = n_r;
		for(int i = 0;i < n_cols; i++) {
			for(int j = 0;j < n_rows; j++) {
				matrix[i][j] =0;
			}
		}

}
public static Matrix addMatrix(Matrix m, Matrix n) {
	
	Matrix result = new Matrix(m.n_rows,m.n_cols);
	for(int i = 0;i < m.n_cols; i++) {
		for(int j = 0;j < m.n_rows; j++) {
			result.matrix[i][j] = m.matrix[i][j]+n.matrix[i][j];
		}
	}
	return result;
}
}
