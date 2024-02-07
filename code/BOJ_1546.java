package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_1546 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String[] inputs = br.readLine().split(" ");

		ArrayList<Integer> score = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			score.add(Integer.parseInt(inputs[i]));
		}

		int max = Collections.max(score);
		double sum = 0;
		for (Integer sc : score) {
			sum += (((double) sc / max) * 100);
		}

		System.out.println(sum / score.size());


	}
}