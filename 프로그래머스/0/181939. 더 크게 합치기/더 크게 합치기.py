def solution(a, b):
    compare1 = int(str(a) + str(b))
    compare2 = int(str(b) + str(a))
    return max(compare1, compare2)