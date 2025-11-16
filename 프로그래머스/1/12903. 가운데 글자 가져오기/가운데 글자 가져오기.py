def solution(s):
    answer = ""
    length = len(s)
    coverage = length // 2
    if length % 2 == 0:
        answer = s[coverage - 1 : coverage + 1]
    else:
        answer = s[coverage]
    return answer