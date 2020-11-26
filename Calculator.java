class Calculator{
public static void main(String[]args){

int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
String c=args[2];
switch(c){
case "+":
System.out.println(a+b);
break;
case "-":
System.out.println(a-b);
break;
case "/":
System.out.println(a/b);
break;
default:
System.out.println(a*b);
}
}
}