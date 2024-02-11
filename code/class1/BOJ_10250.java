package code.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10250 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            String[] inputs = br.readLine().split(" ");
            int[] numbers = new int[inputs.length];
            
            for (int q = 0; q < inputs.length; q++) {
                numbers[q] = Integer.parseInt(inputs[q]);
            }
            
            int h = numbers[0];
            int w = numbers[1];
            int n = numbers[2];
            
            int result = 0;
            
            if (n % h == 0) {
                result = (h * 100) + (n / h);
            } else {
                result = ((n % h) * 100) + ((n / h) + 1);
            }
            
            
            System.out.println(result);
        }
        
        
    }
}