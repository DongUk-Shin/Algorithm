import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        String s3 = s.nextLine();
        
        int i;
        int next = 0;
        
        try {
            i = Integer.parseInt(s1);
            next = i + 3;
        } catch (Exception e1) {
            try {
                i = Integer.parseInt(s2);
                next = i + 2;
            } catch (Exception e2) {
                try {
                    i = Integer.parseInt(s3);
                    next = i + 1;
                } catch (Exception e3) {}
            }
        }
        
        
        if (next % 3 == 0 && next % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (next % 3 == 0 && next % 5 != 0) {
            System.out.println("Fizz");
        } else if (next % 3 != 0 && next % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(next);
        }
        
        
    }
}
