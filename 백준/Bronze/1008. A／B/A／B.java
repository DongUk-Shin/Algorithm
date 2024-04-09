import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 A와 B를 입력받음
        double A = scanner.nextInt();
        double B = scanner.nextInt();

        // A - B를 계산하여 출력
        double result = A / B;
        System.out.println(result);

        scanner.close();
    }
}