def solution(maze):
    n = len(maze)
    m = len(maze[0])
    
    # 방향 벡터 (상, 하, 좌, 우)
    dr = [-1, 1, 0, 0]
    dc = [0, 0, -1, 1]
    
    # 빨간색, 파란색의 시작점과 도착점 찾기
    red_start, red_end = None, None
    blue_start, blue_end = None, None
    
    for i in range(n):
        for j in range(m):
            if maze[i][j] == 1:
                red_start = (i, j)
            elif maze[i][j] == 2:
                blue_start = (i, j)
            elif maze[i][j] == 3:
                red_end = (i, j)
            elif maze[i][j] == 4:
                blue_end = (i, j)
                
    ans = float('inf')
    
    # 방문 체크 배열
    red_visited = [[False] * m for _ in range(n)]
    blue_visited = [[False] * m for _ in range(n)]
    
    red_visited[red_start[0]][red_start[1]] = True
    blue_visited[blue_start[0]][blue_start[1]] = True
    
    def dfs(r_pos, b_pos, r_v, b_v, cnt):
        nonlocal ans
        if cnt >= ans:
            return
        
        # 둘 다 도착지에 도달했는지 확인
        r_done = (r_pos == red_end)
        b_done = (b_pos == blue_end)
        
        if r_done and b_done:
            ans = min(ans, cnt)
            return
        
        # 빨간색 수레가 갈 수 있는 후보지 목록
        r_nexts = []
        if r_done:
            r_nexts = [r_pos]
        else:
            for i in range(4):
                nr, nc = r_pos[0] + dr[i], r_pos[1] + dc[i]
                if 0 <= nr < n and 0 <= nc < m and maze[nr][nc] != 5 and not r_v[nr][nc]:
                    r_nexts.append((nr, nc))
                    
        # 파란색 수레가 갈 수 있는 후보지 목록
        b_nexts = []
        if b_done:
            b_nexts = [b_pos]
        else:
            for i in range(4):
                nr, nc = b_pos[0] + dr[i], b_pos[1] + dc[i]
                if 0 <= nr < n and 0 <= nc < m and maze[nr][nc] != 5 and not b_v[nr][nc]:
                    b_nexts.append((nr, nc))
                    
        # 두 수레의 다음 위치 조합 완전 탐색
        for rn in r_nexts:
            for bn in b_nexts:
                # 1. 동시에 같은 칸으로 이동할 수 없음
                if rn == bn:
                    continue
                # 2. 서로 자리를 맞바꾸며 이동할 수 없음 (기존 위치가 서로 교차)
                if rn == b_pos and bn == r_pos:
                    continue
                
                if not r_done:
                    r_v[rn[0]][rn[1]] = True
                if not b_done:
                    b_v[bn[0]][bn[1]] = True
                
                dfs(rn, bn, r_v, b_v, cnt + 1)
                
                if not r_done:
                    r_v[rn[0]][rn[1]] = False
                if not b_done:
                    b_v[bn[0]][bn[1]] = False

    dfs(red_start, blue_start, red_visited, blue_visited, 0)
    
    return ans if ans != float('inf') else 0
