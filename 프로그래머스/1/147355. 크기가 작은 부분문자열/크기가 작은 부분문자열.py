def solution(t, p):
    answer = 0
    start = 0
    for i in range(0, (len(t) - len(p)) + 1):
        if int(p) >= int(t[start: start + len(p)]):
            answer +=1
        start += 1
    return answer