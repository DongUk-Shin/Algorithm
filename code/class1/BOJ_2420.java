package code.class1;

import java.util.Scanner;

class BOJ_2420 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long m = sc.nextInt();
		long result = Math.abs(n - m);
		
		System.out.println(result);

		sc.close();
	}
}