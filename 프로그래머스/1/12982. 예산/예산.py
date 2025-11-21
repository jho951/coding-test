def solution(d, budget):
    answer = 0
    d.sort()
    count = 0
    for num in d:
        count += 1
        answer += num
        if answer > budget:
            return count - 1
        elif answer == budget:
            return count
    return count
            

