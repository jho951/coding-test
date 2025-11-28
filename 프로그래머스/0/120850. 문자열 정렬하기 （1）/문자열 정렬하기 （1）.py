def solution(my_string):
    result = []
    answer = sorted(''.join([char for char in my_string if char.isdigit()]))
    for string in answer:
        result.append(int(string))
    return result