def solution(my_strings, parts):
    answer = ''
    for index, num in enumerate(my_strings):
        answer += num[parts[index][0] : parts[index][1] + 1]  
    return answer