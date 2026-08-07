class Solution {
    private long maxLeaves;
    private long targetDistLimit;
    private long targetSplitLimit;

    public long solution(long dist_limit, long split_limit) {
        // 문제 풀이를 위해 전역 변수로 초기화
        this.maxLeaves = 1; // 분배 노드가 아예 없을 때의 기본 리프 노드 수는 1개
        this.targetDistLimit = dist_limit;
        this.targetSplitLimit = split_limit;

        // DFS 시작 파라미터:
        // currentFrontier (현재 깊이의 노드 수) = 1
        // usedDist (사용한 분배 노드 수) = 0
        // currentSplit (현재까지의 분배도 곱) = 1
        // confirmedLeaves (누적 확정된 리프 수) = 0
        dfs(1, 0, 1, 0);

        return maxLeaves;
    }

    private void dfs(long currentFrontier, long usedDist, long currentSplit, long confirmedLeaves) {
        // 예산(분배 노드 수 제한)을 초과한 경우 탐색 종료
        if (usedDist > targetDistLimit) {
            return;
        }

        // 현재 시점에서 분배를 멈추고 나머지를 모두 리프 노드로 둘 경우의 총 리프 노드 수 계산
        long totalLeavesWithCurrent = confirmedLeaves + currentFrontier;
        if (totalLeavesWithCurrent > maxLeaves) {
            maxLeaves = totalLeavesWithCurrent;
        }

        // 자식 수 결정: 2분배(더 효율적) 또는 3분배 시도
        for (int childCount = 2; childCount <= 3; childCount++) {
            // 오버플로우 방지를 위한 분배도 상한 검사
            if (currentSplit > targetSplitLimit / childCount) {
                continue;
            }
            
            long nextSplit = currentSplit * childCount;
            if (nextSplit > targetSplitLimit) {
                continue;
            }

            // 이번 층의 노드 중에서 최대 몇 개까지 분배 노드로 바꿀 수 있는지 계산
            long deployableNodes = Math.min(currentFrontier, targetDistLimit - usedDist);
            
            if (deployableNodes > 0) {
                // 분배 노드로 변환된 노드들은 기존의 단일 리프 지위를 잃고 자식을 형성하므로,
                // 리프 수 변동 = (새로 생긴 자식 노드 수) - (분배 노드로 소모된 노드 수)
                long newLeavesGenerated = deployableNodes * childCount;
                long netLeafIncrease = newLeavesGenerated - deployableNodes;
                
                // 다음 깊이 탐색 진행
                // 다음 층의 프런티어는 분배 노드가 퍼져나간 수(deployableNodes * childCount)가 됩니다.
                dfs(deployableNodes * childCount, 
                    usedDist + deployableNodes, 
                    nextSplit, 
                    confirmedLeaves + (currentFrontier - deployableNodes));
            }
        }
    }
}
