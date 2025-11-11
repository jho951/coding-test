def solution(s):
    count = 0       
    total_zeros = 0

    while s != "1":
        total_zeros += s.count('0')
        temp = s.replace('0', '')
        count += 1
        c = len(temp)
        s = bin(c)[2:]
    return [count, total_zeros]
