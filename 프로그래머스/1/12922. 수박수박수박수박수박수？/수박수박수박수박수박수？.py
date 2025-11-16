def solution(n):
    answer = ''
    for num in range(0, n):
        if num % 2 == 0:
            answer += "수"
        else:
            answer += "박"
    return answer