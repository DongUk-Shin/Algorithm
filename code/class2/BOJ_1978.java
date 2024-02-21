package code.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] inputs = br.readLine().split(" ");
		int[] numbers = new int[inputs.length];
		
		
		for (int i = 0; i < inputs.length; i++) {
			numbers[i] = Integer.parseInt(inputs[i]);
		}
		
		int count = 0;
		for (int number : numbers) {
			if (findPrime(number)) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	private static boolean findPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}