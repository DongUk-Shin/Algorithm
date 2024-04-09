import java.io.*;
import java.util.*;

class Main {
	
	static int[][] arr;
	static int n, count;
	static boolean[][] v;
	static int dx[] = {0, 0, -1, 1};
	static int dy[] = {-1, 1, 0, 0};
	static List<Integer> list;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		v = new boolean[n][n];
		arr = new int[n][n];
		list = new LinkedList<>();
		
		
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < n; j++) {
				arr[i][j] = s.charAt(j) - '0';
			}
		}
		
		count = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!v[i][j] && arr[i][j] == 1) {
					dfs(i, j);
					list.add(count);
					count = 1;
				}
			}
		}
		
		System.out.println(list.size());
		Collections.sort(list);
		for (Integer i : list) {
			System.out.println(i);
		}
		
	}
	
	static void dfs(int x, int y) {
		v[x][y] = true;
		arr[x][y] = 1;
		
		for (int i = 0; i < 4; i++) {
			int nx = dx[i] + x;
			int ny = dy[i] + y;
			
			if (nx >= 0 && ny >= 0 && nx < n && ny < n && !v[nx][ny] && arr[nx][ny] == 1) {
				count++;
				dfs(nx, ny);
			}
		}
		
	}
}