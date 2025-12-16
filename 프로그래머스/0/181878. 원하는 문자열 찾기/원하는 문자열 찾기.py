def solution(myString, pat):
    compare1 = myString.upper()
    compare2 = pat.upper()
    answer = 0
    if compare1.find(compare2) != -1:
        return 1
    return answer