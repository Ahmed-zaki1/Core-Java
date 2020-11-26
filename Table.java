import java.util.Scanner;

class Table{
public static void main(String[]args){
for(int i=1;i<1000;i++){
int m,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Statring point");
m=sc.nextInt();
System.out.println("Enter End Point");
n=sc.nextInt();
for(int a=m;a<=n;a++){
for(int b=1;b<=10;b++){
System.out.println(a * b);
}}
}
}}