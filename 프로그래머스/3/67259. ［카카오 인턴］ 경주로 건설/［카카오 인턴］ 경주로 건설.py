from collections import deque
import math

def solution(board):
    N = len(board)
    
    # 방향 정의: 0: 상, 1: 하, 2: 좌, 3: 우
    dr = [-1, 1, 0, 0]
    dc = [0, 0, -1, 1]
    
    # 3차원 최소 비용 배열: cost_map[r][c][방향 d로 진입했을 때의 최소 비용]
    INF = math.inf
    cost_map = [[[INF] * 4 for _ in range(N)] for _ in range(N)]
    
    # 큐: (r, c, 현재 비용, 현재 방향)
    queue = deque()
    
    # --- 초기 설정: (0, 0)에서 첫 이동 ---
    
    # 1. 아래로 출발 (방향: 1)
    if N > 1 and board[1][0] == 0:
        cost_map[1][0][1] = 100
        queue.append((1, 0, 100, 1))
        
    # 2. 오른쪽으로 출발 (방향: 3)
    if N > 1 and board[0][1] == 0:
        cost_map[0][1][3] = 100
        queue.append((0, 1, 100, 3))
    
    # (0, 0)의 비용은 0으로 설정
    cost_map[0][0] = [0, 0, 0, 0]
    
    # --- BFS 탐색 ---
    while queue:
        r, c, current_cost, current_dir = queue.popleft()
        
        # 4가지 방향으로 이동 시도
        for next_dir in range(4):
            nr, nc = r + dr[next_dir], c + dc[next_dir]
            
            # 1. 맵 범위 체크 및 벽('1')이 아닌지 확인
            if 0 <= nr < N and 0 <= nc < N and board[nr][nc] == 0:
                
                # 2. 비용 계산
                # 직선: 방향이 같음 (100원 추가)
                if current_dir == next_dir:
                    next_cost = current_cost + 100
                # 코너: 방향이 다름 (100원 + 코너 500원 추가)
                else:
                    next_cost = current_cost + 600
                
                # 3. 최소 비용 갱신 및 큐 추가
                # 현재 기록된 비용보다 새로 계산된 비용이 더 작다면 갱신
                if next_cost < cost_map[nr][nc][next_dir]:
                    cost_map[nr][nc][next_dir] = next_cost
                    queue.append((nr, nc, next_cost, next_dir))

    # 최종 도착점 (N-1, N-1)의 4가지 방향 진입 비용 중 최솟값을 반환
    return min(cost_map[N-1][N-1])