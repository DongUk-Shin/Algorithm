import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        
        int[] a = new int[6];
        
        for (int i = 0; i < 6; i++) {
            a[i] = s.nextInt();
        }
        
        int T = s.nextInt();
        int P = s.nextInt();
        
        int c = 0;
        
        for (int i = 0; i < 6; i++) {
            
            c += a[i] / T;
            if (a[i] % T != 0) {
                c++;
            }
        }
        
        System.out.println(c);
        System.out.println(N / P + " " + N % P);
    }
}
