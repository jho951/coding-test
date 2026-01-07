def solution(n, k):
    answer = []
    for num in range(n + 1):
        if num != 0 and num % k == 0:
            answer.append(num)
    return answer