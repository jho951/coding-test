def solution(a, b):
    compare1 = int(str(a) + str(b))
    compare2 = 2 * a * b
    return max(compare1, compare2)