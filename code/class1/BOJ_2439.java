package code.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {

			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}

			for (int k = n - i; k < n; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}