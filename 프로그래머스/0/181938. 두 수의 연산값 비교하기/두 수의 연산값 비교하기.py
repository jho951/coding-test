def solution(a, b):
    compare1 = int(str(a) + str(b))
    compare2 = 2 * a * b
    return compare1 if compare1 > compare2 else compare2