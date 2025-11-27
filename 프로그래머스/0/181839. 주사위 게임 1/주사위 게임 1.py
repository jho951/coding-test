def solution(a, b):
    sumNum = a + b
    if sumNum % 2 != 0:
        return 2 * sumNum
    else:
        if a % 2 == 0 and b % 2 == 0:
            return abs(a - b)
        else:
            return a ** 2 + b ** 2