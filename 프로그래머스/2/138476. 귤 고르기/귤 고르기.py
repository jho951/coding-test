from collections import Counter

def solution(k, tangerine):
    answer = 0
    
    # 1. 귤 크기별 개수 세기 (딕셔너리/Counter 사용)
    # dicte = {크기: 개수, ...}
    dicte = Counter(tangerine)
    
    # 2. 개수(Value)만 추출하여 내림차순으로 정렬
    # counts 리스트에는 [4, 3, 2, 1]처럼 개수만 저장됩니다.
    counts = sorted(dicte.values(), reverse=True)
    
    # 3. 상자에 담기 (그리디: 많은 개수부터 순서대로)
    for count in counts:
        # 이 종류를 상자에 담으면, 종류의 수는 1 증가합니다.
        answer += 1
        
        # 상자에 담은 개수만큼 k를 줄입니다.
        k -= count
        
        # k가 0 이하가 되었다면 목표 개수를 채운 것입니다.
        if k <= 0:
            break
            
    return answer