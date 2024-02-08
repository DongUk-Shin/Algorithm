package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] numbers = new int[9];

		for(int i = 0 ; i < 9 ; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}

		int max = 0, maxi = 0;

		for (int i = 0; i < 9; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
				maxi = i;
			}
		}
		System.out.println(max);
		System.out.println(maxi + 1);

	}
}