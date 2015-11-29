
//
//Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0.
//

public class setMatrixIfZero1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = new int[4][5];
		for(int i = 0; i < m.length; i ++){
			for(int j = 0; j < m[0].length; j ++){
				m[i][j] = (i * i + 2) * (j + 1);
			}
		}
		m[2][3] = 0;
		m[2][1] = 0;
		m[3][1] = 0;
		for(int i = 0; i < m.length; i ++){
			for(int j = 0; j < m[0].length; j ++){
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		setZero(m);
		for(int i = 0; i < m.length; i ++){
			for(int j = 0; j < m[0].length; j ++){
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	public static void setZero(int[][] matrix){
		int[] rows = new int[matrix.length];
		int[] cols = new int[matrix[0].length];
		for(int i = 0; i < matrix.length; i ++){
			for(int j = 0; j < matrix[0].length; j ++){
				if(matrix[i][j] == 0){
					rows[i] = 1;
					cols[j] = 1;
				}
			}
		}
		for(int i = 0; i < matrix.length; i ++){
			for(int j = 0; j < matrix[0].length; j ++){
				if(rows[i] == 1 || cols[j] == 1){
					matrix[i][j] = 0;
				}
			}
		}
	}
}
