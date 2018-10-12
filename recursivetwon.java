
public class recursivetwon {
	
	public static void main (String [] args){
		
		System.out.println(recPow(5));
		
	}
	
	public static int recPow(int n){
		
		if (n < 0){
			System.out.println("positive int needed");
			return 0;
		}
		
		if (n == 0){
			return 1;
		}
		
		else
			return 2 * recPow(n-1);
		
	}
}
