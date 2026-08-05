import java.util.*;

class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        
        // 각 시간대별로 만료되어 사라질 서버의 개수를 기록하는 배열 (0시 ~ 23시)
        int[] expireServers = new int[24];
        int currentServers = 0; // 현재 가동 중인 서버 개수

        for (int i = 0; i < 24; i++) {
            // 1. 현재 시간에 수명이 다한 서버들을 차감
            currentServers -= expireServers[i];

            // 2. 현재 시간대 이용자 수를 수용하기 위해 필요한 총 서버 수 계산
            int requiredServers = players[i] / m;

            // 3. 현재 가동 중인 서버가 필요한 서버보다 부족한 경우 증설 진행
            if (currentServers < requiredServers) {
                int addCount = requiredServers - currentServers; // 추가해야 할 서버 개수
                answer += addCount;             // 총 증설 횟수 누적
                currentServers += addCount;     // 현재 가동 서버 수에 추가

                // 4. 증설된 서버는 k시간 후에 만료되므로, i + k 시점에 만료 예약
                if (i + k < 24) {
                    expireServers[i + k] += addCount;
                }
            }
        }

        return answer;
    }
}
