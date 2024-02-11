package code.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		int[] numbers = new int[26];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = -1;
		}
		
		for (int i = 0; i < s.length(); i++) {
			if (numbers[s.charAt(i) - 'a'] == -1) {
				numbers[s.charAt(i) - 'a'] = i;
			}
		}
		
		for (int number : numbers) {
			System.out.print(number + " ");
		}

	}
}