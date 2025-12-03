def solution(my_string, alp):
    answer = ''
    for i, string in enumerate(my_string):
        if string == alp:
            answer += string.upper()
        else:
            answer += string
    return answer