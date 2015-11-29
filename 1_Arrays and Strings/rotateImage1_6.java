/*
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, 
 * write a method to rotate the image by 90 degrees. Can you do this in place?
*/
public class rotateImage1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = new int[5][5];
		System.out.println(m[0].length);
		for(int i = 0; i < m.length; i ++){
			for(int j = 0; j < m.length; j ++){
				m[i][j] = (i * i + 2) * (j + 1);
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		rotate(m, m.length);
		for(int i = 0; i < m.length; i ++){
			for(int j = 0; j < m.length; j ++){
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	public static void rotate(int[][] matrix, int n){
		for(int layer = 0; layer < n/2; layer ++){
			int first = layer;
			int last = n - layer - 1;
			for(int i = first; i < last; i ++){
				int offset = i - first;
				int temp = matrix[first][i];
				matrix[first][i] = matrix[last-offset][first];
				matrix[last-offset][first] = matrix[last][last-offset];
				matrix[last][last-offset] = matrix[i][last];
				matrix[i][last] = temp;
			}

		}
	}

}
