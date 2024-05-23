import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> results = new ArrayList<>();
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // 각 테스트 케이스에서의 사람 수
            String[] mbtis = new String[N];
            
            for (int i = 0; i < N; i++) {
                mbtis[i] = sc.next();
            }
            
            
            if (N > 32) { // 33명 이상이면 반드시 같은 MBTI가 존재하므로 거리 0이 가능
                results.add(0);
                continue;
            }
            
            int minDistance = Integer.MAX_VALUE;
            
            // 모든 세 사람 조합에 대해 최소 거리를 계산
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    for (int k = j + 1; k < N; k++) {
                        int distance = mbtiDistance(mbtis[i], mbtis[j])
                                + mbtiDistance(mbtis[j], mbtis[k])
                                + mbtiDistance(mbtis[k], mbtis[i]);
                        minDistance = Math.min(minDistance, distance);
                    }
                }
            }
            results.add(minDistance);
        }
        
        for (int result : results) 
            System.out.println(result);
        
        sc.close();
        
    }
    
    private static int mbtiDistance(String mbti1, String mbti2) {
        int distance = 0;
        for (int i = 0; i < 4; i++) {
            if (mbti1.charAt(i) != mbti2.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }
    
    
}