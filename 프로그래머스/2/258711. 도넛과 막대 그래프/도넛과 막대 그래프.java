import java.util.*;

class Solution {
    public int[] solution(int[][] edges) {
        // 정점 번호의 최댓값을 구하기 위한 변수
        int maxNode = 0;
        for (int[] edge : edges) {
            maxNode = Math.max(maxNode, Math.max(edge[0], edge[1]));
        }

        // 각 정점의 진입 차수와 진출 차수를 기록할 배열
        int[] inDegree = new int[maxNode + 1];
        int[] outDegree = new int[maxNode + 1];

        for (int[] edge : edges) {
            outDegree[edge[0]]++;
            inDegree[edge[1]]++;
        }

        int createdNode = 0;
        int donutCount = 0;
        int barCount = 0;
        int eightCount = 0;

        // 모든 정점을 순회하며 특징에 따라 분류
        for (int i = 1; i <= maxNode; i++) {
            // 1. 생성된 정점 조건: Out >= 2 이고 In == 0
            if (outDegree[i] >= 2 && inDegree[i] == 0) {
                createdNode = i;
            } 
            // 2. 막대 그래프 조건: Out == 0 이고 In >= 1 (단독 정점인 경우 In이 0일 수 있으나 생성된 정점과 구별됨)
            else if (outDegree[i] == 0 && inDegree[i] >= 1) {
                barCount++;
            } 
            // 3. 8자 그래프 조건: Out == 2 이고 In >= 2
            else if (outDegree[i] == 2 && inDegree[i] >= 2) {
                eightCount++;
            }
        }

        // 4. 도넛 그래프 조건: 생성된 정점의 총 진출 차수 - (막대 개수 + 8자 개수)
        donutCount = outDegree[createdNode] - (barCount + eightCount);

        return new int[]{createdNode, donutCount, barCount, eightCount};
    }
}
