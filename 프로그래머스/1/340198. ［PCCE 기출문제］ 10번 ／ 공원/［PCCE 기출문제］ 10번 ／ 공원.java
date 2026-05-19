import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        // 1. 돗자리 크기를 오름차순으로 정렬
        Arrays.sort(mats);
        
        // 2. 가장 큰 돗자리부터 역순으로 깔 수 있는지 확인
        for (int i = mats.length - 1; i >= 0; i--) {
            int len = mats[i];
            
            // 공원의 모든 좌표를 순회
            for (int r = 0; r < park.length; r++) {
                for (int c = 0; c < park[0].length; c++) {
                    
                    // 현재 위치에서 해당 크기의 돗자리를 깔 수 있는지 확인
                    if (canPlace(park, r, c, len)) {
                        return len; // 가장 큰 크기부터 확인했으므로 바로 정답 반환
                    }
                }
            }
        }
        
        // 어떤 돗자리도 깔 수 없는 경우
        return -1;
    }
    
    // 돗자리를 깔 수 있는지 검사하는 메서드
    private boolean canPlace(String[][] park, int r, int c, int len) {
        // 공원 범위를 벗어나는 경우 깔 수 없음
        if (r + len > park.length || c + len > park[0].length) {
            return false;
        }
        
        // len x len 크기의 정사각형 영역에 사람이 있는지 확인
        for (int i = r; i < r + len; i++) {
            for (int j = c; j < c + len; j++) {
                // "-1"이 아니면 이미 다른 사람이 있는 자리임
                if (!park[i][j].equals("-1")) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
