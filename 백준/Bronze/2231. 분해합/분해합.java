import java.util.*;  import java.io.*; 

class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(b.readLine());
        
        int result = 0;
        
        for (int i = 1; i <= n; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum + i == n) {
                result = i;
                break;
            }
            
        }
        
        System.out.println(result);
        
        
    }
}