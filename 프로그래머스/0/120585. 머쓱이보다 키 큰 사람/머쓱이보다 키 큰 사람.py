def solution(array, height):
    answer = 0
    for num in array:
        if height < num:
            answer+= 1
    return answer