package code.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4153 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        while (true) {
            String[] inputs = br.readLine().split(" ");
            int[] numbers = new int[inputs.length];
            
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            int c = Integer.parseInt(inputs[2]);
            
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            
            if ((a * a + b * b) == c * c || 
                    a * a == (b * b  + c * c) ||
                    b * b == (a * a  + c * c)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
        
        
    }
}