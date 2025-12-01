def solution(food):
    # 1. 선수 A가 먹는 음식의 배치 문자열을 생성합니다.
    # 이 문자열은 왼쪽부터 먹는 순서(칼로리 낮은 순)를 나타냅니다.
    left_side = ""
    
    # food[0]은 물(0번 음식)의 개수이며, 이것은 계산에 사용하지 않습니다.
    # 1번 음식부터 순서대로 반복합니다 (i는 음식의 번호, 1부터 시작).
    # food의 인덱스는 음식 번호 - 1 입니다.
    for i in range(1, len(food)):
        # i번 음식의 총 개수
        total_count = food[i]
        
        # 각 선수가 먹는 i번 음식의 개수 (총 개수를 2로 나눈 몫)
        # 이 개수만큼 음식 번호 i를 문자열로 반복하여 추가합니다.
        # 예: count=3, i=2 이면 "222"를 추가
        count_per_player = total_count // 2
        
        # 음식 번호 i를 count_per_player 만큼 반복하여 left_side에 추가
        left_side += str(i) * count_per_player
    
    # 2. 전체 음식 배치 문자열을 구성합니다.
    # left_side (선수 A) + "0" (물) + left_side 역순 (선수 B)
    # 파이썬에서 문자열[::-1]은 문자열을 역순으로 만드는 슬라이싱 기법입니다.
    # left_side[::-1]이 곧 선수 B가 먹을 음식을 오른쪽부터 왼쪽으로 나열한 순서입니다.
    full_arrangement = left_side + "0" + left_side[::-1]
    
    return full_arrangement