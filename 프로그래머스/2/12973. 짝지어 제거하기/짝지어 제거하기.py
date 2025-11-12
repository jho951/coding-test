def solution(s):
    stack = []
    for char in s:
        # 1. Pop 조건: 스택이 비어있지 않고, 최상단 요소와 현재 문자가 같으면 제거(Pop)
        if stack and stack[-1] == char:
            stack.pop()
        # 2. Push 조건: 그 외의 경우 (다르거나, 스택이 비어있는 경우) 추가(Push)
        else:
            stack.append(char)
            
    # 최종적으로 스택이 비어있으면 모든 짝이 제거된 것
    if len(stack) == 0:
        return 1
    else:
        return 0