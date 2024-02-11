package code.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8958 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            String inputs = br.readLine();
            int score = 0;
            int c = 1;
            
            for (int j = 0; j < inputs.length(); j++) {
                if (inputs.charAt(j) == 'O') {
                    score += c;
                    c++;
                } else {
                    c = 1;
                }
            }
            System.out.println(score);
        }
        
    }
}