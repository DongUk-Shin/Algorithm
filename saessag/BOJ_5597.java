package saessag;

import java.util.*;

class BOJ_5597 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[31];
		int x = 0;

		for(int i = 1; i < 29; i++) {
			x = sc.nextInt();
			arr[x] = 1;
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != 1)
				System.out.println(i);
		}
		sc.close();
	}
}
