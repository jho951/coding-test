def solution(myString):
    answer = ''
    compare = ord("l")
    for string in myString:
        if compare > ord(string):
            answer += "l"
        else:
            answer += string
    return answer