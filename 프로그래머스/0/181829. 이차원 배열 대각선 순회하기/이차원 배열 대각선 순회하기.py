def solution(board, k):
    """
    i + j <= k를 만족하는 모든 (i, j)에 대한 board[i][j]의 합을 계산합니다.

    Args:
        board (list[list[int]]): 2차원 정수 배열.
        k (int): 조건에 사용되는 정수.

    Returns:
        int: 조건을 만족하는 board[i][j]의 합.
    """
    total_sum = 0
    
    # board의 행(i) 크기를 구합니다.
    rows = len(board)
    
    # board가 비어있지 않다면, 열(j) 크기를 구합니다.
    # 문제의 조건상 board는 항상 유효하다고 가정합니다.
    if rows > 0:
        cols = len(board[0])
    else:
        # board가 비어있는 경우 (예외 처리)
        return 0

    # 2차원 배열을 순회합니다.
    for i in range(rows):  # 행 인덱스 i
        for j in range(cols):  # 열 인덱스 j
            
            # 조건 i + j <= k를 만족하는지 확인합니다.
            if i + j <= k:
                # 조건을 만족하면 해당 원소를 total_sum에 더합니다.
                total_sum += board[i][j]
                
    return total_sum