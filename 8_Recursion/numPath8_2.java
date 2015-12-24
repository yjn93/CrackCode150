
public class numPath8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		move(1,1,3);
		System.out.println(count);
	}
	public static int count = 0;
	public static void move(int x, int y, int n){
		if(x == n && y == n){ 
			count ++;
			return;
		}
		if(x < n)
			move(x + 1, y, n);
		if(y < n)
			move(x, y + 1, n);		
	}
}
