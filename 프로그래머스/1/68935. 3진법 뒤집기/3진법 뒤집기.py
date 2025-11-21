def solution(n):
    answer = 0
    temp = ''
    while n > 0:
        temp += str(n % 3)
        n = n // 3
    
    for i, num in enumerate(temp):
        answer += int(num) * 3 ** (len(temp)- 1 - i) 
    return answer

# 3진법 만들고
# 뒤집고
# 10진법으로