import java.util.*;


class Solution {
    public int solution(int[] A, int[] B) {
        int count = 0;
        int ap = 0;
        int bp = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int i = 0; i < A.length; i++) {
            
            if (A[ap] > B[bp]) {
                bp++;
            } else if (A[ap] < B[bp]) {
                ap++;
                bp++;
                count++;
            } else {
                bp++;
            }
        }
        
        return count;
    }
}