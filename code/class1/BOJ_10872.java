package code.class1;

import java.util.Scanner;

class BOJ_10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 1;

		for (int i = 1; i <= n; i++) {
			r *= i;
		}
		System.out.println(r);
		sc.close();
	}
}