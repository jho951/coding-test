def solution(s1, s2):
    set1 = set(s1) 
    set2 = set(s2)
    answer = set1 & set2
    return len(answer)