
import java.io.*;
import java.util.Scanner;

public class BOJ_10807 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int v = sc.nextInt();
		int x = 0;
		for (int i = 0; i < N; i++) {
			if (arr[i] == v) {
				x++;
			}
		}
		System.out.println(x);

		sc.close();
	}
}