def solution(n):
    answer = []
    for num in range(n + 1):
        if num % 2 != 0:
            answer.append(num)
    return answer