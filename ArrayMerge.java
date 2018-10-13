
public class ArrayMerge {

	public static void main(String [] args){
		System.out.println(gcd(20, 30));
	}
	public static int gcd(int m, int n){
		if (m < 0 || n < 0){
			System.out.println("No negatives accepted");
		}
		if (m == n){
			return m;
		}
		else if (m > n){
			System.out.println(m + " " + n);
			return gcd(m-n, n);
		}
		else {
			System.out.println(m + " " + n);
			return gcd(m, n-m);
		}
	}	
}
