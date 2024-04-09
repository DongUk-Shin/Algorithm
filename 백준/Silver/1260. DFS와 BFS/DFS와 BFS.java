
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int[][] arr;
	static boolean[] visited;
	static int n, m, start;
	static Queue<Integer> q = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputs = br.readLine().split(" ");
		
		
		n = Integer.parseInt(inputs[0]);
		m = Integer.parseInt(inputs[1]);
		start = Integer.parseInt(inputs[2]);
		
		arr = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for (int i = 0; i < m; i++) {
			String[] s = br.readLine().split(" ");
			int line1 = Integer.parseInt(s[0]);
			int line2 = Integer.parseInt(s[1]);
			
			arr[line1][line2] = 1;
			arr[line2][line1] = 1;
		}
		dfs(start);
		System.out.println();
		visited = new boolean[n+1];
		bfs(start);
	}
	
	
	public static void dfs(int s) {
		visited[s] = true;
		System.out.print(s + " ");
		for (int i = 0; i <= n; i++) {
			if (arr[s][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int s) {
		q.add(s);
		visited[s] = true;
		
		while (!q.isEmpty()) {
			s = q.poll();
			System.out.print(s + " ");
			
			for (int i = 1; i <= n; i++) {
				if (arr[s][i] == 1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}
	
	
}