
public class fibonacci8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(37));
		System.out.println(iterative(37));
	}
	
	public static int fibonacci(int n){
		if(n < 0)
			return -1;
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		return fibonacci(n-1) + fibonacci(n-2);			
	}
	
	public static int iterative(int n){
		if(n < 0)
			return -1;
		if(n == 0)
			return 0;
		int first = 0;
		int second = 1;
		for(int i = 2; i <=n; i ++){
			second = first + second;
			first = second - first;
		}
		return second;
	}
}
