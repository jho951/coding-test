def solution(s):
    # 각 문자가 가장 최근에 나타난 '인덱스'를 저장할 딕셔너리
    last_seen = {} 
    
    # 결과를 저장할 리스트
    ee = []
    
    for i, char in enumerate(s):
        if char not in last_seen:
            # 1. 문자가 이전에 한 번도 나타나지 않은 경우
            ee.append(-1)
        else:
            # 2. 문자가 이전에 나타난 경우
            # '현재 인덱스' - '가장 최근에 나타난 인덱스' = 거리
            distance = i - last_seen[char]
            ee.append(distance)
        
        # 현재 문자의 인덱스를 last_seen 딕셔너리에 업데이트 (가장 최근 위치 갱신)
        last_seen[char] = i
        
    return ee