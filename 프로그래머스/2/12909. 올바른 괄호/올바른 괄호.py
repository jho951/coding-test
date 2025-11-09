def solution(s):
    stack = []
    for ele in s:
        if ele == "(": 
            stack.append("(")      
        else: 
            if not stack: 
                return False
            else:
                stack.pop() 
    return not stack