def solution(scores):
    wanho = scores[0]
    wanho_sum = sum(wanho)
    
    # 1. 근무 태도 내림차순, 동료 평가 오름차순 정렬
    scores.sort(key=lambda x: (-x[0], x[1]))
    
    answer = 1
    max_peer = 0
    
    for a, b in scores:
        # 탈락하지 않는 조건 체크를 위해 동료 평가 점수 갱신
        if b < max_peer:
            # 두 점수가 모두 낮은 경우가 존재함 (인센티브 제외)
            if [a, b] == wanho:
                return -1
        else:
            max_peer = b
            if a + b > wanho_sum:
                answer += 1
                
    return answer
