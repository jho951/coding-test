class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        
        // 찾으려는 상자(num)의 행과 열 위치 구하기 (0부터 시작하는 인덱스 기준)
        int targetRow = (num - 1) / w;
        int targetCol = getColumn(num, w, targetRow);
        
        // 전체 상자의 마지막 행 구하기
        int maxRow = (n - 1) / w;
        
        // targetRow부터 마지막 행까지 올라가며 같은 열에 상자가 존재하는지 확인
        for (int row = targetRow; row <= maxRow; row++) {
            // 현재 검사하는 행의 시작 번호와 끝 번호 계산
            int startNum = row * w + 1;
            int endNum = (row + 1) * w;
            
            // 현재 행에서 targetCol 위치에 해당하는 실제 상자 번호 찾기
            int currentNum = getNumByCol(w, row, targetCol, startNum, endNum);
            
            // 구한 상자 번호가 전체 상자 개수(n) 이하이면 꺼내야 하는 상자임
            if (currentNum <= n) {
                answer++;
            }
        }
        
        return answer;
    }
    
    // 특정 행에서 상자의 번호를 기반으로 '열 위치'를 반환하는 메서드
    private int getColumn(int num, int w, int row) {
        if (row % 2 == 0) {
            // 짝수 행 (0, 2, 4...): 왼쪽 -> 오른쪽 순서
            return (num - 1) % w;
        } else {
            // 홀수 행 (1, 3, 5...): 오른쪽 -> 왼쪽 순서
            return w - 1 - ((num - 1) % w);
        }
    }
    
    // 특정 행과 열 위치를 기반으로 '상자 번호'를 역산하는 메서드
    private int getNumByCol(int w, int row, int col, int start, int end) {
        if (row % 2 == 0) {
            // 짝수 행: 왼쪽부터 시작하므로 시작값에 열 인덱스를 더함
            return start + col;
        } else {
            // 홀수 행: 오른쪽부터 시작하므로 끝값에서 열 인덱스를 뺌
            return end - col;
        }
    }
}
