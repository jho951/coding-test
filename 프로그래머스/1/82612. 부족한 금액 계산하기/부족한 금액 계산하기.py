def solution(price, money, count):
    answer = 0
    for m in range(1, count + 1):
        answer += price * m
        print(answer)
    if answer - money > 0:
        return answer - money
    else:
        return 0