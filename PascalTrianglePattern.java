import java.util.Scanner;  
public class PascalTrianglePattern  
{  
public static void main(String[] args)  
{  
int i, j, a;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number of a you want to print: ");  
a = sc.nextInt();          
for (i= 0; i<= a-1; i++)  
{  
for (j=0; j<=i; j++)   
{  
System.out.print("*"+ " ");  
}   
System.out.println("");   
}   
for (i=a-1; i>=0; i--)  
{  
for(j=0; j <= i-1;j++)  
{  
System.out.print("*"+ " ");  
}  
System.out.println("");  
}  
}  
}  