def solution(strArr):
    answer = []
    for n in strArr:
        if n.find("ad") == -1:
            answer.append(n)
    return answer