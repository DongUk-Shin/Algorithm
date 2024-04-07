
import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(b.readLine());
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(b.readLine());
        }
        
        Arrays.sort(arr);
        int gap = (int) Math.round(n * 0.15);
        
        double sum = 0;
        
        for (int i = gap; i < n - gap; i++) {
            sum += arr[i];
        }
        System.out.println(Math.round(sum / (n - (gap * 2))));
        
    }
}