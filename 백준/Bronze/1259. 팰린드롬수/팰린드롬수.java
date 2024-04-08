import java.util.*; import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        
        
        while (true) {
            String input = b.readLine();
            boolean flag = true;
            
            if (input.equals("0")) {
                break;
            }
            
            int l = input.length();
            
            for (int i = 0; i < l / 2; i++) {
                if (input.charAt(i) != input.charAt(l - 1 - i)) {
                    flag = false;
                }
            }
            if (flag) System.out.println("yes");
            else System.out.println("no");
            
        }
        
    }
}