package code.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int x = a * b * c;
        
        int[] arr = new int[10];
        
        while (x > 0) {
            arr[x % 10]++;
            x /= 10;
        }
        
        for (int i : arr) {
            System.out.println(i);
        }
    }
}