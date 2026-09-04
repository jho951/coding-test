class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int position = 1; // 탐색을 시작할 아파트 번호
        int si = 0;       // 기존에 설치된 기지국 배열(stations)의 인덱스
        int coverage = 2 * w + 1; // 기지국 하나가 전파를 커버하는 총 길이

        // 현재 위치가 전체 아파트 크기 n 이하일 때까지 반복
        while (position <= n) {
            // 이미 설치된 기지국이 남아있고, 현재 위치가 그 기지국의 전파 범위에 들어가는 경우
            if (si < stations.length && position >= stations[si] - w) {
                // 해당 기지국의 전파 범위를 벗어난 바로 다음 위치로 이동
                position = stations[si] + w + 1;
                si++; // 다음 기지국 확인
            } 
            // 현재 위치에 전파가 닿지 않는 경우 (새로운 기지국 설치 필요)
            else {
                // 최대한 오른쪽에 설치하여 현재 위치를 포함한 coverage만큼 커버
                answer++;
                position += coverage;
            }
        }

        return answer;
    }
}
