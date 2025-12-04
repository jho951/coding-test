def solution(n):
    # ans: 건전지 사용량의 최솟값 (점프 횟수)
    ans = 0
    # current_location: 이동하려는 거리 (목표 지점)
    current_location = n # 목표 지점에서 시작

    while current_location > 0:
        if current_location % 2 == 0:
            # 현재 위치가 짝수: 순간이동의 역과정 (나누기 2) 수행
            # 이 때 건전지 사용량은 늘지 않습니다.
            current_location //= 2
        else:
            # 현재 위치가 홀수: 1칸 점프의 역과정 (빼기 1) 수행
            # 이 때 1칸 점프가 필요했으므로 건전지 사용량(점프 횟수) +1
            current_location -= 1
            ans += 1
    return ans