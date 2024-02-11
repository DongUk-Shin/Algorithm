package code.class1;

public class BOJ_4673 {

	public static void main(String[] args) {

		boolean[] arr = new boolean[10001];


		for (int i = 1; i <= 10001; i++) {
			int n = d(i);
			if (n < 10001) {
				arr[n] = true;
			}
		}

		for (int i = 1; i < 10001; i++) {
			if (arr[i] == false) {
				System.out.println(i);
			}
		}
	}

	public static int d(int number) {
		int s = number;

		while (number > 0) {
			s = s + (number % 10);
			number /= 10;
		}

		return s;
	}
}
