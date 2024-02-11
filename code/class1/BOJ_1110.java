package code.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1110 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		if (n < 10) {
			n *= 10;
		}

		int temp = n;
		int count = 0;
		int one, sum, newNum;

		 do {
			count++;
			one = n % 10;
			n /= 10;

			sum = one + n % 10;

			newNum = (one * 10) + (sum % 10);
			n = newNum;
		} while(newNum != temp);
		System.out.print(count);
	}
}