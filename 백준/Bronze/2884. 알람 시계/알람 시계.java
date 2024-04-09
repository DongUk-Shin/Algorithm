

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] inputs = br.readLine().split(" ");
		int h = Integer.parseInt(inputs[0]);
		int m = Integer.parseInt(inputs[1]);
		
		int i = (h * 60) + m - 45;
		
		if (i < 0) {
			i += (60 * 24);
		}
		
		System.out.println((i / 60) + " " + (i % 60));
		
	}
}