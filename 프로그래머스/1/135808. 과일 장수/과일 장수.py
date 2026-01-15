def solution(k, m, score):
    answer = 0
    # 1. 사과 점수를 내림차순으로 정렬합니다.
    score.sort(reverse=True)
    
    # 2. m개씩 묶었을 때 각 상자의 최저 점수를 찾아 계산합니다.
    # 인덱스가 m-1, 2m-1, 3m-1 ... 인 사과가 각 상자의 최저 점수입니다.
    for i in range(m - 1, len(score), m):
        answer += score[i] * m
        
    return answer