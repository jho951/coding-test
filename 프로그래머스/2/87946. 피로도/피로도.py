def solution(k, dungeons):
    N = len(dungeons)
    visited = [False] * N
    max_dungeons = 0

    def dfs(current_k, count):
        nonlocal max_dungeons
        
        # 현재까지 탐험한 횟수를 최댓값과 비교하여 갱신
        max_dungeons = max(max_dungeons, count) 

        # 모든 던전에 대해 반복
        for i in range(N):
            min_required = dungeons[i][0]
            fatigue_cost = dungeons[i][1]
            
            # 1. 아직 방문하지 않았고, 
            # 2. 현재 피로도가 최소 필요 피로도보다 같거나 크다면 탐험 가능
            if not visited[i] and current_k >= min_required:
                
                # 방문 처리
                visited[i] = True
                
                # 다음 탐험 (재귀 호출)
                # (횟수 + 1, 남은 피로도)
                dfs(current_k - fatigue_cost, count + 1)
                
                # 백트래킹 (다른 경로를 탐색하기 위해 방문 상태 초기화)
                visited[i] = False
    
    # 초기 피로도 k와 0개의 던전 탐험 상태로 DFS 시작
    dfs(k, 0)
    
    return max_dungeons
