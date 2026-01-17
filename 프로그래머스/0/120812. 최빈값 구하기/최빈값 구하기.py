from collections import Counter

def solution(array):
    # 1. 리스트를 딕셔너리 형태(요소: 개수)로 변환
    # 예: [1, 2, 3, 3] -> {1: 1, 2: 1, 3: 2}
    counts = Counter(array)
    
    # 2. 가장 높은 빈도수(value)를 찾음
    max_count = max(counts.values())
    
    # 3. 그 빈도수를 가진 key들을 리스트로 추출
    max_keys = [k for k, v in counts.items() if v == max_count]
    
    # 4. 결과 반환 (최빈값이 여러 개면 -1, 하나면 그 값 반환)
    if len(max_keys) > 1:
        return -1
    return max_keys[0]

# 테스트
print(solution([1, 2, 3, 3, 3, 4])) # 결과: 3
print(solution([1, 1, 2, 2]))       # 결과: -1