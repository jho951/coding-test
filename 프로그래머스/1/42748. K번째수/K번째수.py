def solution(array, commands):
    answer = []
    for num in commands:
        temp = sorted(array[num[0] - 1 : num[1]])
        answer.append(temp[num[2] - 1])
    return answer