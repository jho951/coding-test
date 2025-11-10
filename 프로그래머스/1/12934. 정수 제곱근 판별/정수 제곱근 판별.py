def solution(n):
    answer = -1
    if n ** 0.5 == n // n ** 0.5:
        answer = (n ** 0.5 + 1) ** 2
    return answer