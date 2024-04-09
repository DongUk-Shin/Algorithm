import java.io.*;
import java.util.*;

class Main {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int n;
    static char[][] arr;
    static boolean[][] v;
    static char curr;
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(b.readLine());
        
        arr = new char[n][n];
        v = new boolean[n][n];
        
        for (int i = 0; i < n; i++) {
            String s = b.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        
		int count1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!v[i][j]) {
                    dfs(i, j);
					count1++;
                }
            }
        }
		
		v = new boolean[n][n];
		int count2 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 'G') {
					arr[i][j] = 'R';
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!v[i][j]) {
					dfs(i, j);
					count2++;
				}
			}
		}
        System.out.println(count1 + " " + count2);
    }
    
    static void dfs(int x, int y) {
        
        curr = arr[x][y];
        v[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            
            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if (curr == arr[nx][ny] && !v[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
        
    }
    
}