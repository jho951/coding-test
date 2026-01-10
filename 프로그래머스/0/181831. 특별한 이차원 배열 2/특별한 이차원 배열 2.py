def solution(arr):
    n = len(arr)
    for i in range(n):
        for j in range(n):
            # i행 j열과 j행 i열이 다르면 즉시 0 반환
            if arr[i][j] != arr[j][i]:
                return 0
    # 모든 검사를 통과하면 1 반환
    return 1