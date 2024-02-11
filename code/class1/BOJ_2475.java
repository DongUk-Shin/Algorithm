package code.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2475 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] inputs = br.readLine().split(" ");
        int[] numbers = new int[inputs.length];
        
        for (int i = 0; i < inputs.length; i++) {
            numbers[i] = Integer.parseInt(inputs[i]);
        }
        
        double pow = Math.pow(numbers[0], 2) + Math.pow(numbers[1], 2)
                + Math.pow(numbers[2], 2) + Math.pow(numbers[3], 2) + Math.pow(numbers[4], 2);
        
        int result = (int) pow % 10;
        System.out.println(result);
        
    }
}