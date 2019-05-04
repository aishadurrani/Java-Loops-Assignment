package DEPackage;

public class LoopsAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question 2: Create a program that calculates and displays a Factorial 
		// of a given int n using only for loop.
		
			      int number = 4;
			      long fact = 1;
		
			      
			      for (int n = 1; n <= number; n++) {
			   
			    	  	fact = fact * n;
			      }
			      
			      System.out.println("Factorial of "+number+" is: "+fact);
			    		  
			   }
	
}	