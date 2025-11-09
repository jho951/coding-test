def solution(n):
    result = 0
    while n > 0:
        digit = n % 10
        result += digit
        n //= 10
    return result