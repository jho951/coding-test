# def solution(n):
#     answer = ""
#     strN = [int(s) for s in str(n)]
#     strN.sort(reverse = True)
#     intN = [str(s) for s in strN]
#     for s in intN:
#         answer += s
#     return int(answer)

def solution(n):
    strN = [s for s in str(n)]
    strN.sort(reverse = True)

    answer = "".join(strN) 
    
    return int(answer)