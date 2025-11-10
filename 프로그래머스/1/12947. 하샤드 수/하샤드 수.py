def solution(x):
    answer = False
    strX = [s for s in str(x)]
    result = 0;
    for s in strX:
        result += int(s)
    if x % result == 0:
        answer = True
    return answer