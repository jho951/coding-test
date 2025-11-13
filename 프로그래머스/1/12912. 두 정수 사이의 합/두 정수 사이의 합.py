def solution(a, b):
    answer = 0
    minN = min(a, b)
    maxN = max(a, b) + 1
    for n in range(minN, maxN):
        answer+= n 
    return answer