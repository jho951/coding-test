def solution(number):
    result = 0
    answer = [int(i) for i in number]
    for num in answer:
        result += num
    return result % 9