def solution(plans):
    # 시간을 "hh:mm" 형식에서 분(minute) 단위로 변환하는 함수
    def to_minute(time_str):
        h, m = map(int, time_str.split(':'))
        return h * 60 + m

    # 1. 과제 정보를 (이름, 시작시간(분), 소요시간(분)) 형태로 변환 및 시간순 정렬
    parsed_plans = []
    for name, start, playtime in plans:
        parsed_plans.append([name, to_minute(start), int(playtime)])
    
    parsed_plans.sort(key=lambda x: x[1])
    
    answer = []
    stack = []  # [과제명, 남은 소요 시간]
    
    for i in range(len(parsed_plans)):
        name, start, playtime = parsed_plans[i]
        
        # 다음 과제가 있다면 현재 과제를 끝낼 때까지 걸리는 시간 계산
        if i < len(parsed_plans) - 1:
            next_start = parsed_plans[i + 1][1]
        else:
            next_start = float('inf') # 마지막 과제인 경우
            
        current_time = start
        
        # 현재 과제를 완료할 수 있는 경우
        if current_time + playtime <= next_start:
            current_time += playtime
            answer.append(name)
            
            # 과제를 끝내고 다음 과제 시작 전까지 시간이 남는다면 멈춘 과제 처리
            while stack:
                paused_name, paused_time = stack.pop()
                if current_time + paused_time <= next_start:
                    current_time += paused_time
                    answer.append(paused_name)
                else:
                    # 다 못 끝내면 남은 시간만큼 갱신해서 다시 스택에 넣기
                    paused_time -= (next_start - current_time)
                    stack.append([paused_name, paused_time])
                    break
        else:
            # 현재 과제를 다 끝내지 못하고 멈춰야 하는 경우
            left_time = playtime - (next_start - current_time)
            stack.append([name, left_time])
            
    # 스택에 남아있는 멈춘 과제들을 역순(최근에 멈춘 것부터)으로 처리
    while stack:
        paused_name, _ = stack.pop()
        answer.append(paused_name)
        
    return answer
