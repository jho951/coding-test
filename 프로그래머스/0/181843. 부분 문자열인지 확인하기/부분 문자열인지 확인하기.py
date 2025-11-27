def solution(my_string, target):
    start = 0
    end = len(target)

    if end > len(my_string):
        return 0
    
    while end <= len(my_string):
        if my_string[start:end] == target:
            return 1
        start += 1
        end += 1
        
    return 0