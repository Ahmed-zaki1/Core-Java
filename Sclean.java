import java.util.Arrays;
import java.util.Scanner;

class Sclean{
	 static String stringClean(char str[], int n) 
    { 
        int index = 0; 
  
        for (int i = 0; i < n; i++) 
        { 
  
            int j; 
            for (j = 0; j < i; j++)  
            { 
                if (str[i] == str[j]) 
                { 
                    break; 
                } 
            } 
  
            if (j == i)  
            { 
                str[index++] = str[i]; 
            } 
        } 
        return String.valueOf(Arrays.copyOf(str, index)); 
    } 
  
    public static void main(String[] args) 
    { 
        for (int i=0;true ;i++ ) {
            
        
    	String a;
    	Scanner sc=new Scanner(System.in);
     	System.out.println("Enter String");
     		a=sc.nextLine();
        char str[] = a.toCharArray(); 
        int n = str.length; 
        System.out.println("Before Cleaning = "+a);
        System.out.println("After Cleaning = "+stringClean(str, n)); 
    } }
}