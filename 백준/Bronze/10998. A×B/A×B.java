import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 A와 B를 입력받음
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // A - B를 계산하여 출력
        int result = A * B;
        System.out.println(result);

        scanner.close();
    }
}