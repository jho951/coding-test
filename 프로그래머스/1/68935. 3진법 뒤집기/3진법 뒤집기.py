def solution(n):
    temp = ''
    while n > 0:
        temp += str(n % 3)
        n = n // 3
    
    answer = int(temp,3)
    # for i, num in enumerate(temp):
    # answer += int(num) * 3 ** (len(temp)- 1 - i) 
    return answer