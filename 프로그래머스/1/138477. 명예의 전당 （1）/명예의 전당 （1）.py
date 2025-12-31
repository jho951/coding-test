def solution(k, score):
    answer = []
    hall_of_fame = []

    for s in score:
        hall_of_fame.append(s) # 일단 오늘 가수의 점수를 추가
        hall_of_fame.sort(reverse=True) # 내림차순 정렬
        
        # 명예의 전당 정원이 k명을 초과하면 k명까지만 유지
        if len(hall_of_fame) > k:
            hall_of_fame = hall_of_fame[:k]
            
        # 명예의 전당 중 최하위 점수(가장 마지막 요소)를 기록
        answer.append(hall_of_fame[-1])
        
    return answer