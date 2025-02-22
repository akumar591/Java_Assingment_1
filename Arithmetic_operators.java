public class Arithmetic_operators{

	public static int Add (int a, int b){
		int res = a+b;
		return res;
	}

	public static int Subtraction(int a, int b ){
		int res = a-b;
		return res;	
	}

    public static int Multiplication(int a , int b ){
		int ans = a*b;
		return ans;
	}

	public static int Division(int a , int b ){
		int res = a/b;
		return res;
	}

	public static void main (String[] args){
		int a = 20 ;
		int b = 10 ;
		System.out.println("Sum of " + a + " and " + b + " is : " + Add(a,b));
		System.out.println("Subtraction of " + a + " and " + b + " is : " + Subtraction(a,b));
		System.out.println("Multiplication of " + a + " and " + b + " is : " + Multiplication(a,b));
		System.out.println("Division of " + a + " and " + b + " is : " + Division(a,b));

	
	}
        
}