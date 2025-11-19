def solution(n):
    string = str(n)
    answer = 0
    for num in string:
        answer += int(num)
    return answer