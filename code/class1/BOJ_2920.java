package code.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2920 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] inputs = br.readLine().split(" ");
        int[] numbers = new int[inputs.length];
        
        for (int i = 0; i < inputs.length; i++) {
            numbers[i] = Integer.parseInt(inputs[i]);
        }
        
        String s = "";
        
        for (int i = 0; i < numbers.length - 1; i++) {
            
            if (numbers[i + 1] - 1 == numbers[i]) {
                s = "ascending";
            } else if (numbers[i + 1] + 1 == numbers[i]) {
                s = "descending";
            } else {
                s = "mixed";
                break;
            }
        }
        
        System.out.println(s);
    }
}