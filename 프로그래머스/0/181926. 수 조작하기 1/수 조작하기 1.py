def solution(n, control):
    answer = n
    for cha in control:
        if cha == "w":
            answer += 1
        elif cha == "s":
            answer -= 1
        elif cha == "d":
            answer += 10
        else:
            answer -= 10
    return answer