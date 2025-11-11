def solution(s):
    answer = s.split(" ")
    for s in range(0, len(answer)):
        answer[s]= answer[s].capitalize();
    return " ".join(answer)