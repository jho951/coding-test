def solution(s):
    result = ""
    answer = []
    for num in s:
        answer.append(ord(num))
    answer.sort(reverse=True)
    for string in answer:
        result += chr(string)
    return result