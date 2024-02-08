package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] numbers = new int[n];

		for (int i = 0; i < s.length; i++) {
			numbers[i] = Integer.parseInt(s[i]);
		}
		int min = 1000001, max = -1000001;

		for (int i = 0; i < n; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}

			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println(min + " " + max);
	}
}