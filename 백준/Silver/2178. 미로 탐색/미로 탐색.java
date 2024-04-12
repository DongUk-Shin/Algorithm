import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    
    static int[] dx = { -1, 1, 0, 0 }; 
    static int[] dy = { 0, 0, -1, 1 };
    
    static int[][] arr;
    static boolean[][] v;
    static int n, m;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        
        String[] s = b.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        
        arr = new int[n][m];
        v = new boolean[n][m];
        
        for (int i = 0; i < n; i++) {
            String t = b.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = t.charAt(j) - '0';
            }
        }
        bfs(0, 0);
        System.out.println(arr[n - 1][m - 1]);
    }
    
    static void bfs(int x, int y) {
        v[x][y] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        
        while (!q.isEmpty()) {
            int t[] = q.poll();
            int nx = t[0];
            int ny = t[1];
            for (int i = 0; i < 4; i++) {
                int nnx = nx + dx[i];
                int nny = ny + dy[i];
            
                if (nnx >= 0 && nny >= 0 && nnx < n && nny < m) {
                    if (!v[nnx][nny] && arr[nnx][nny] == 1) {
                        v[nnx][nny] = true;
                        q.add(new int[]{nnx, nny});
                        arr[nnx][nny] = arr[nx][ny] + 1;
                    }
                }
                
            }
            
        }
        
        
    }
    
}
