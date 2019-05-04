package DEPackage;

public class LoopsAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question 1: Create a program that displays first n numbers in Fibonacci
		// Series using loop.
		
			int n = 9, 
				n1 = 0, 
			    n2 = 1;


	        for (int i = 1; i <= n; ++i)
	        {
	            System.out.print(n1 + " , ");

	            int sum = n1 + n2;
	            n1 = n2;
	            n2 = sum;
	        }
	    }
	

	

}
