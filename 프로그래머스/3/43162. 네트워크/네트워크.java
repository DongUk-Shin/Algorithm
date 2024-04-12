class Solution {
    
    boolean[] v;
    int[][] arr;
    int N;
    
    public int solution(int n, int[][] computers) {
        v = new boolean[n];
        arr = computers;
        
        N = n;
        
        int count = 0;
        for (int i = 0; i < n; i ++) {
            if (!v[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
    
    void dfs(int x) {
        v[x] = true;
        
        for (int i = 0; i < N; i++) {
            if (i == x) {
                continue;
            }
            else if (!v[i] && arr[x][i] == 1) {
                dfs(i);
            }
        }
        
    }
}