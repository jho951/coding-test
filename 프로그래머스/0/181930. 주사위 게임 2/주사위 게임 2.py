def solution(a, b, c):
    compare1 = a + b + c
    compare2 = a**2 + b**2 + c**2
    compare3 = a**3 + b**3 + c**3
    if a != b and b != c and a != c:
        return compare1
    elif a == b and b == c and a == c:
        return compare1 * compare2 * compare3
    else:
        return compare1 * compare2 