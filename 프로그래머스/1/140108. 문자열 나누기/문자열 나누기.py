def solution(s):
    # 분해된 문자열의 개수를 저장할 변수
    answer = 0
    # 문자열 s를 리스트로 변환하여 앞에서부터 효율적으로 제거할 수 있게 준비
    s_list = list(s)
    
    while s_list:
        # 1. 새 분해가 시작되었으므로 개수 1 증가 (규칙 3, 4의 분리)
        answer += 1
        
        # 2. 첫 글자를 기준 문자 x로 설정 (규칙 1)
        x = s_list.pop(0)
        
        # 3. 횟수 초기화 및 첫 글자 처리
        count_x = 1
        count_other = 0
        
        # 남은 문자열을 계속 읽어나감
        while s_list:
            char = s_list.pop(0) # 다음 글자를 읽고 제거

            # 횟수 세기 (규칙 2)
            if char == x:
                count_x += 1
            else:
                count_other += 1
            
            # 분리 조건 확인 (규칙 3)
            if count_x == count_other:
                # 횟수가 같아지면 현재 분해는 여기서 종료하고, while s_list: (바깥 루프)로 돌아가 남은 문자열로 새 분해 시작
                break
                
        # (while s_list: 내부 루프가 끝났을 때)
        # 1. break로 종료되었다면: count_x == count_other 이며, 남은 s_list가 있을 수도 없을 수도 있음.
        # 2. s_list가 비어서 종료되었다면: count_x != count_other 일 수 있음 (규칙 4).
        # 두 경우 모두 answer는 이미 증가되었으므로, 바깥 루프의 다음 반복으로 넘어감 (s_list가 비었으면 반복 종료)
        
    return answer
