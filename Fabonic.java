import java.util.Scanner;
class Fabonic {
    static void Fabonnic(int N) {
        int a, b, d;
        while (d < N) {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter Value of A");
            a = obj.nextInt();
            System.out.println("Enter value of B");
            b = obj.nextInt();
            int c = a + b;
            a = b;
            b = c;
            d = d + 1;
        }
    }
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter details");

        int N = obj1.nextInt();
        Fabonnic(N);
    }
}