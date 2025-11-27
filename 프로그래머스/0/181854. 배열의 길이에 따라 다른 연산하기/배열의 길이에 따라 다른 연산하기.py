def solution(arr, n):
    answer=[]
    for i, num in enumerate(arr):
        if len(arr) % 2 == 0:
            if i % 2 != 0:
                answer.append(num + n);
            else:
                answer.append(num)
        else:
            if i % 2 == 0:
                answer.append(num + n);
            else:
                answer.append(num)
    return answer