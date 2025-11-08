def solution(n, computers):
    """
    컴퓨터의 개수 n과 연결 정보 computers를 받아 네트워크의 개수를 반환합니다.
    """
    # 1. 방문 여부를 기록할 배열 초기화
    visited = [False] * n
    
    # 2. 네트워크의 개수 (결과) 초기화
    network_count = 0
    
    def dfs(start_node):
        """
        주어진 컴퓨터(노드)와 연결된 모든 컴퓨터를 재귀적으로 방문 처리합니다.
        """
        # 현재 노드를 방문 처리
        visited[start_node] = True
        
        # 현재 노드(start_node)와 연결된 모든 다른 노드(j)를 확인
        for j in range(n):
            # 두 조건:
            # 1) start_node와 j가 연결되어 있고 (computers[start_node][j] == 1)
            # 2) j를 아직 방문하지 않았다면 (not visited[j])
            if computers[start_node][j] == 1 and not visited[j]:
                # 해당 노드를 시작점으로 DFS 재귀 호출
                dfs(j)

    # 3. 모든 컴퓨터를 순회하며 네트워크 탐색
    for i in range(n):
        # 아직 방문하지 않은 컴퓨터를 발견하면
        if not visited[i]:
            # 새로운 네트워크가 시작됨 -> 개수 증가
            network_count += 1
            # 이 네트워크에 속한 모든 컴퓨터를 방문 처리
            dfs(i)
            
    return network_count