import java.util.*; 
class Factorials{
	
	public static int factorials(int n){
      if(n != 0)
        return n * factorials(n-1);
      else
       return 1;
	}
	public static void main(String ar[]){
		int number = 5;
		int result = factorials(number);
		System.out.println(result);
		int A[] = {1, 4, 45, 6, -50, 10, 2}; 
        int n = A.length; 
          
        // Function calling 
        System.out.println(findMinRec(A, n)); 

	}
	 public static int findMinRec(int A[], int n) 
    { 
      // if size = 0 means whole array 
      // has been traversed 
      if(n == 1) 
        return A[0]; 
          
        return Math.min(A[n-1], findMinRec(A, n-1)); 
    } 
}
