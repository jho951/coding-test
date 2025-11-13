def solution(absolutes, signs):
    answer = 0
    for index in range(0, len(signs)):
        if signs[index]:
            answer += absolutes[index]
        else: 
            answer -= absolutes[index]
    return answer