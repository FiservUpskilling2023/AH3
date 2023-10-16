
public class ah3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fizzBuzz(15);
		fizzBuzzRecursive(15);
	}
	
	public static void fizzBuzz(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print("FizzBuzz ");
			} else if(i%3 == 0) {
				System.out.print("Fizz ");
			} else if(i%5 == 0) {
				System.out.print("Buzz ");
			} else {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void fizzBuzzRecursive(int n) {
		if(n == 0) {
			return;
		} else {
			fizzBuzzRecursive(n-1);
			if(n%3==0 && n%5==0) {
				System.out.print("FizzBuzz ");
			} else if(n%3 == 0) {
				System.out.print("Fizz ");
			} else if(n%5 == 0) {
				System.out.print("Buzz ");
			} else {
				System.out.print(n+" ");
			}
		}
	}
}