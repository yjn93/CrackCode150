
public class eightQueens8_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] columns = new int[8];
		eightQueens(columns, 0);
		System.out.println("count: " + count);
	}
	
	public static int count = 0;
	public static boolean check(int[] columns, int row){
		for(int i = 0; i < row; i ++){
			if(columns[i] == columns[row] || Math.abs(columns[i] - columns[row]) == row - i)
				return false;
		}
		return true;
	}
	
	public static void eightQueens(int[] columns, int row){
		if(row == 8){
			printBoard(columns);
			System.out.println();
			count ++;
			return;
		}
		for(int i = 0; i < 8; i ++){
			columns[row] = i;
			if(check(columns, row)){
				eightQueens(columns, row + 1);
			}
		}
	}
	
	public static void printBoard(int[] columns){
		for(int i = 0; i < 8; i ++){
			for(int j = 0; j < columns[i]; j ++){
				System.out.print("# ");
			}
			System.out.print("* ");
			for(int j = columns[i] + 1; j < 8; j ++){
				System.out.print("# ");
			}
			System.out.println();
		}
	}

}
