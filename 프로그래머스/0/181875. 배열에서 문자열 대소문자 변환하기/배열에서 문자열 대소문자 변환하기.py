def solution(strArr):
    answer = []
    for i, string in enumerate(strArr):
        if i % 2 == 0:
            answer.append(string.lower())
        else:
            answer.append(string.upper())
    return answer