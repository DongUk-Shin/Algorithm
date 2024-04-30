import java.util.Scanner;

public class Main {
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        
        int g = gcd(a, b);
        System.out.println(g);
        System.out.println((a * b) / g);
    }
    
    //gcd(a, b) = gcd(b, r)
    //r = a mod b
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
