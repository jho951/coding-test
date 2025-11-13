def solution(s):
    s= s.lower()
    temp1 = 0
    temp2 = 0
    for se in s:
        if se == "p":
            temp1 += 1
        elif se == "y":
            temp2 += 1
    if temp1 == temp2: return True
    return False