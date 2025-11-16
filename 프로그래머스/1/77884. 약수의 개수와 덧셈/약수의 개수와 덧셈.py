def solution(left, right):
    answer = 0
    while (left <= right):
        ele = []
        for num in range(1,left +1):
            if left % num == 0:
                ele.append(num)
        if len(ele) % 2 == 0:
            answer += num
        else:
            answer -= num
        left = left + 1
    return answer