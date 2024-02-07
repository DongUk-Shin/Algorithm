package code;

import java.io.*;

public class BOJ_ {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		int[] numbers = new int[inputs.length];

		for (int i = 0; i < inputs.length; i++) {
			numbers[i] = Integer.parseInt(inputs[i]);
		}

		for (int number : numbers) {
			System.out.println(number);
		}
	}
}